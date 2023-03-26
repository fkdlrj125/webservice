package himedia.third.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import himedia.third.domain.Member;

//@Repository
public class MemoryMemberRepository implements MemberRepository{

	private static Map<Long,Member> store = new HashMap<Long,Member>();
	private static long sequence = 0L; 
	
	@Override
	public Member save(Member member) {
		member.setId(++sequence);
		store.put(member.getId(), member);		// 복잡한 구조에서는 member의 id와 sequence가 다를 수 있기 때문에
		return member;							// member의 id를 쓰는 것이 안정적이다
	}

	@Override
	public Optional<Member> findById(Long id) {
		return Optional.ofNullable(store.get(id));
	}

	@Override
	public Optional<Member> findByName(String name) {
		return store.values().stream()
							.filter((Member m) -> m.getName().equals(name))
							.findAny();
	}

	@Override
	public List<Member> findAll() {
		return new ArrayList<Member>(store.values());
	}
	
	public void clearStore() {
		store.clear();
	}
	
}
