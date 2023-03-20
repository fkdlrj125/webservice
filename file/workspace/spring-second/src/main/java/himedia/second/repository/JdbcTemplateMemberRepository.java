package himedia.second.repository;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import himedia.second.domain.Member;

@Repository
public class JdbcTemplateMemberRepository implements MemberRepository{

	private final JdbcTemplate jdbcTemplate;
	
	private RowMapper<Member> memberRowMapper() {
		return (ResultSet rs, int rowNum) -> {
			Member member = new Member();
			member.setId(rs.getLong("id"));
			member.setName(rs.getString("name"));
			return member;
		};
	}
	
	public JdbcTemplateMemberRepository(DataSource dataSource) { // 의존성 주입
		System.out.println("[JdbcTemplateMemberRepository] 실행됨");
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Member save(Member member) {
		// 데이터 저장을 쉽게 해줌
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate); 	// Insert문을 생성하는 클래스 
		jdbcInsert.withTableName("member").usingGeneratedKeyColumns("id"); 	// 테이블 지정, 자동으로 증가하는 키(기본키) 지정
		
		Map<String, Object> parameters = new HashMap<>();					// executeAndReturnKey가 매개변수로 Map을 받기 때문에 생성
		parameters.put("name", member.getName());							// 현재 member에 id가 없기 때문에 name만 넣어줌
		
		Number key = jdbcInsert.executeAndReturnKey(parameters);			// 테이블의 형태가 key : value 형태이기 때문에 Map을 넣어줌
		System.out.println("[save method] DB에 데이터 저장 후 리턴 받은 key value >> "+key);
		member.setId(key.longValue());										// 결과값을 member의 id에 넣어줌
		return member;
	}

	@Override
	public Optional<Member> findById(Long id) {
		List<Member> result = jdbcTemplate.query("select * from member where id = ?", memberRowMapper(),id);
		return result.stream().findAny();
	}

	@Override
	public Optional<Member> findByName(String name) {
		List<Member> result = jdbcTemplate.query("select * from member where name = ?", memberRowMapper(),name);
		return result.stream().findAny();
	}

	@Override
	public List<Member> findAll() {
		// query안에서 자동으로 반복문을 돌면서 해당 쿼리를 실행하고 RowMapper()를 실행해 member에 값을 넣어줌
		return jdbcTemplate.query("select * from member", memberRowMapper());
	}
	
}
