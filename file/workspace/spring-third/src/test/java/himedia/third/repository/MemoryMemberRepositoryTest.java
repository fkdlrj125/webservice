package himedia.third.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import himedia.third.domain.Member;

@SpringBootTest
public class MemoryMemberRepositoryTest {

//	[방법 1]
//	MemoryMemberRepository repository = new MemoryMemberRepository();

//	[방법 2] - 필드에 직접 DI - Junit에서 생성자를 통한 작업이 있기 때문에 우선순위가 밀려 
							 // 생성자를 통한 DI는 불가능
	@Autowired MemoryMemberRepository repository;
	
	@AfterEach
	void clear() {
		repository.clearStore(); // repository내 Map(store)를 비워줘서
									// 다른 test 결과에 영향을 주지 않게 함
	}

//	서버 실행과 무관
//	단위 test : 메소드 하나만 test하는 과정
//	통합 test : 여러 단위 test를 합친 test
	@Test
	void save() {
//		given : 어떤 데이터
		Member member = new Member();
		member.setName("first");

//		when  : 무엇 - 저장
		Member savedMember = repository.save(member);

//		then  : 검증 - 가입한 사용자와 저장된 사용자 같은지 확인
//		assetThat(실제값).isEqualTo(예측값);
		assertThat(savedMember).isEqualTo(member);
//		assertThat(savedMember).isEqualTo(null);	// failures 발생
	}

	@Test
	void findById() {
//		given : 어떤 데이터
		Member member = new Member();
		member.setName("둘");
//		Member savedMember = repository.save(member);
		repository.save(member);

//		when  : 아이디 조회
		Member findMember = repository.findById(member.getId()).get();

//		then  : 검증
//		assertThat(findMember.getId()).isEqualTo(savedMember.getId());
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
