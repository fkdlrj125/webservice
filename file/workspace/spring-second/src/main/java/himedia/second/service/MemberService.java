package himedia.second.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import himedia.second.domain.Member;
import himedia.second.repository.MemberRepository;

@Service
public class MemberService {
	// 다형성으로 구현해 자식을 추가해도 자식만 바꿔주면 되서 service에 영향이 가지 않는다
	// private final MemberRepository repository = new MemoryMemberRepository();
	private final MemberRepository repository;
	
	public MemberService(MemberRepository repository) {
		System.out.println("[MemberService] 실행됨");
		this.repository = repository;
	}
	
	/**
	 * 	회원 가입
	 */
	public Long join(Member member) {
		repository.save(member);
		return member.getId();
	}
	
	/**
	 * 	아이디로 검색(조회)
	 */
	public Optional<Member> findId(Long memberId) {
		Optional<Member> findId = repository.findById(memberId);
		return findId;
	}
	
	/**
	 *  이름으로 검색(조회)
	 */
	public Optional<Member> findName(String memberName) {
		Optional<Member> findName = repository.findByName(memberName);
		return findName;
	}
	
	/**
	 * 	전체 데이터 검색(조회)
	 */
	public List<Member> findMember(){
		return repository.findAll();
	}
}	
