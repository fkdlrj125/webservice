package himedia.third.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import himedia.third.domain.Member;
import himedia.third.repository.MemberRepository;

@Service
public class MemberService {
	private final MemberRepository repository;
	
	public MemberService(MemberRepository repository) {
		this.repository = repository;
	}
	
	public Long join(Member member) {
		return repository.save(member).getId();
	}
	
	public Optional<Member> findId(Long id){
		return repository.findById(id);
	}
	
	public Optional<Member> findName(String name){
		return repository.findByName(name);
	}
	
	public List<Member> findMembers() {
		return repository.findAll();
	}
	
}
