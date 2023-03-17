package himedia.second.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

// 라이브러리 추가해야 함
import org.springframework.jdbc.datasource.DataSourceUtils;

import himedia.second.domain.Member;

public class JdbcMemberRepository  implements MemberRepository {
	
	private final DataSource dataSource;
	
	// 생성자
	// 의존성 주입
	// 물리적 연결 - 아이디, 비밀번호를 입력해 연결하는 것
	public JdbcMemberRepository(DataSource dataSource) {
		this.dataSource = dataSource;
	}
		
	@Override
	public Member save(Member member) {
		String sql = "insert into member(name) values(?)";  // 동적쿼리 - 정해지지 않은 쿼리 -> 변수가 있는 쿼리
		// 입출력은 예외가 발생하기 쉽기 때문에 예외처리를 꼭 해줘야 된다
		Connection conn = null;
		PreparedStatement pstmt = null; // 동적쿼리를 처리하는 타입
		ResultSet rs = null;			// 결과값이 1개 이상일 수 있기 때문에 ResultSet에 저장
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); // 첫 번째 컬럼(id)은 자동으로 생성
			pstmt.setString(1, member.getName()); 	// 첫 번째 변수에 값 설정
			pstmt.executeUpdate();				  	// 테이블이 변경되는 쿼리 실행
			rs = pstmt.getGeneratedKeys();		  	// 자동으로 생성되는 키(auto-increment된 id)가 있는 로우를 받아옴
			if (rs.next()) {					  	// 결과값이 있으면 실행
				member.setId(rs.getLong(1));		// 쿼리결과에 1번(첫 번째 로우의 id)을 member의 id에 long으로 넣어줌
			} else {								// 2번은(첫 번째 로우의 name) 3번은(두 번째 로우의 id)
				throw new SQLException("id 조회 실패");
			}
			return member;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			close(conn, pstmt, rs);
		}
	}

	@Override
	public Optional<Member> findById(Long id) {
		String sql = "select * from member where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;

		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				Member member = new Member();
				member.setId(rs.getLong("id"));
				member.setName(rs.getString("name"));
				return Optional.of(member);
			} else {
				return Optional.empty();
			}
		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			close(conn, pstmt, rs);
		}
	}

	@Override
	public List<Member> findAll() {
		String sql = "select * from member"; // 정적쿼리 - 정해진 쿼리
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			List<Member> members = new ArrayList<>();
			while (rs.next()) {
				Member member = new Member();
				member.setId(rs.getLong("id"));
				member.setName(rs.getString("name"));
				members.add(member);
			}
			return members;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			close(conn, pstmt, rs);
		}
	}

	@Override
	public Optional<Member> findByName(String name) {
		String sql = "select * from member where name = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				Member member = new Member();
				member.setId(rs.getLong("id"));
				member.setName(rs.getString("name"));
				return Optional.of(member);
			}
			return Optional.empty();
		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			close(conn, pstmt, rs);
		}
	}

	private Connection getConnection() {
		return DataSourceUtils.getConnection(dataSource);
	}

	private void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null) {
				close(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void close(Connection conn) throws SQLException {
		DataSourceUtils.releaseConnection(conn, dataSource);
	}
}