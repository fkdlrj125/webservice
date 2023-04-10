package himedia.rest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import himedia.rest.domain.User;
import himedia.rest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor // 의존성 주입해주는 생성자 생성
@Slf4j
public class UserController {
	
	private final UserRepository repository;
	
	@PostMapping
	public User postMethod(@RequestBody User user) { // RequestBody는 바디에 값을 실어 오는 것을 받기 때문에 JSON형식으로 값을 넘겨줘야 함
		log.info("[POST] =======================");	 // JSON형식은 {키 : 값} 형태로 작성 문자열은 모두 ""로 감싸줘야 함
		log.info("user name >> {}",user.getName());
		log.info("user age >> {}",user.getAge());
		return repository.save(user);
	}
	
	@GetMapping
	public User getMethod(Long id) {
		User user = repository.findById(id).get();
		
		log.info("[GET] =======================");	 
		log.info("user id >> {}",user.getId());
		log.info("user name >> {}",user.getName());
		log.info("user age >> {}",user.getAge());
		return user;
	}
	
	@PutMapping		// 로우의 기본키를 제외한 모든 값 변경
	public User putMethod(@RequestBody User user) {
		log.info("[Put] =======================");	 
		log.info("user id >> {}",user.getId());
		log.info("user name >> {}",user.getName());
		log.info("user age >> {}",user.getAge());
		return repository.save(user);	// id가 같으면 해당 로우의 값을 변경 
	}
	
	@PatchMapping	// 로우의 값 하나만 변경
	public User patchMethod(@RequestBody User user) {
		log.info("[PATCH] =======================");	 
		log.info("user id >> {}",user.getId());
		log.info("user name >> {}",user.getName());
		log.info("user age >> {}",user.getAge());
		return repository.save(user);	
	}
	
	@DeleteMapping
	public String deleteMethod(Long id) {
		log.info("[DELETE] =======================");
		repository.deleteById(id);
		return "Id >> "+id+" 삭제 완료!";
	}
	
}
