package himedia.third.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import himedia.third.domain.Member;
import himedia.third.repository.MemoryMemberRepository;

@SpringBootTest
class MemberServiceTest {

	@Autowired MemoryMemberRepository repository;
//	MemoryMemberRepository repository = new MemoryMemberRepository();
	
	@Autowired MemberService service;
//	MemberService service = new MemberService(repository);
	
	@AfterEach
	void clear() {
		repository.clearStore();
	}
	
	@Test
	void join() {
//		given
		Member member = new Member();
		member.setName("first");
		
//		when
		Long resultId = service.join(member);
		
//		then
		assertThat(resultId).isEqualTo(member.getId());
	}

	@Test
	void findId() {
//		given
		Member member = new Member();
		member.setName("second");
		service.join(member);
		
//		when
		Member resultMember = service.findId(member.getId()).get();
		
//		then
		assertThat(resultMember.getId()).isEqualTo(member.getId());
	}
	
	@Test
	void findName() {
//		given
		Member member = new Member();
		member.setName("third");
		service.join(member);
		
//		when
		Member resultMember = service.findName(member.getName()).get();
		
//		then
		assertThat(resultMember.getName()).isEqualTo(member.getName());
	}
	
	@Test
	void findMembers() {
//		given
		Member member1 = new Member();
		member1.setName("홍길동");
		service.join(member1);
		Member member2 = new Member();
		member2.setName("박보검");
		service.join(member2);
		
//		when
		List<Member> resultList = service.findMembers();
		
//		then
		assertThat(resultList.size()).isEqualTo(2);
	}
}
