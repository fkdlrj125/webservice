package himedia.third.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import himedia.third.domain.Member;

@SpringBootTest
class JdbcTemplateMemberRepositoryTest {

	@Autowired JdbcTemplateMemberRepository repository;

	@Test
	void save() {
//		given : 어떤 데이터
		Member member = new Member();
		member.setName("first");

//		when  : 무엇 - 저장
		Member savedMember = repository.save(member);

//		then  : 검증 - 가입한 사용자와 저장된 사용자 같은지 확인
		assertThat(savedMember).isEqualTo(member);
	}

	@Test
	void findById() {
//		given : 어떤 데이터
		Member member = new Member();
		member.setName("둘");
		repository.save(member);

//		when  : 아이디 조회
		Member findMember = repository.findById(member.getId()).get();

//		then  : 검증
		assertThat(findMember.getId()).isEqualTo(member.getId());
	}

	@Test
	void findByName() {
//		given
		Member member = new Member();
		member.setName("박보검");
		repository.save(member);

//		when
		Member findMember = repository.findByName(member.getName()).get();

//		then
		assertThat(findMember.getName()).isEqualTo(member.getName());
	}

	@Test
	void 전체검사() {
//		given
		Member member1 = new Member();
		Member member2 = new Member();
		member1.setName("one");
		member2.setName("two");
		repository.save(member1);
		repository.save(member2);

//		when
		List<Member> member = repository.findAll();

//		then
		assertThat(member.size()).isEqualTo(2);
	}
}
