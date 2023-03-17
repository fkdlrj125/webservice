package himedia.second.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import himedia.second.domain.Member;

public class MemoryMemberRepository implements MemberRepository{

	private static Map<Long, Member> store = new HashMap<Long, Member>();
	private static long sequence = 0L;
	
	@Override
	public Member save(Member member) {
		member.setId(++sequence);
		System.out.println("[repository] id >> "+member.getId());
		store.put(member.getId(), member);
		return member;
	}

	@Override
	public Optional<Member> findById(Long id) {
		return Optional.ofNullable(store.get(id));
	}

	@Override
	public Optional<Member> findByName(String name) {
		return store.values().stream()
					  		.filter((Member b) -> b.getName().equals(name))
					  		.findAny();
	}

	@Override
	public List<Member> findAll() {
		return new ArrayList<Member>(store.values());
	}
	
}
