package himedia.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import himedia.rest.domain.User;

// JpaRepository : 기본적인 repository 기능을 담은 인터페이스
public interface UserRepository extends JpaRepository<User, Long> {
	
}
