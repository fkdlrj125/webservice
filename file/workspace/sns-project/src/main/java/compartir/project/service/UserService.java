package compartir.project.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import compartir.project.domain.Admin;
import compartir.project.domain.User;
import compartir.project.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	private final UserRepository repository;
	
	public UserService(UserRepository repository) {
		this.repository = repository;
	}
	
	public Boolean login(String userName, String password) {
		Optional<User> user = repository.findByUserName(userName);
		if(user.isEmpty())
			return false;
		else if(user.get().getPassword().trim().equals(password))
			return true;
		return false;
	}
	
	public String addUser(User user) {
		if(repository.findByUserName(user.getUserName()).isPresent())
			return "해당 아이디가 이미 존재합니다.";
		repository.save(user);
		return "회원 가입 완료!";
	}

	public User findId(Long id) {
		Optional<User> result = repository.findById(id);
		if(result.isEmpty())
			return new User();
		return result.get();
	}

	public User findUserName(String userName) {
		Optional<User> result = repository.findByUserName(userName);
		if(result.isEmpty())
			return new User();
		return result.get();
	}

	public User findRealName(String realName) {
		Optional<User> result = repository.findByRealName(realName);
		if(result.isEmpty())
			return new User();
		return result.get();
	}

	public List<User> users() {
		return repository.findAll();
	}

	public User update(Long updateId,User user) {
		if(user.getProfile() == null) {
			user.setProfile(repository.findById(updateId).get().getProfile());
		}
		User updateUser = repository.updateUser(updateId,user);
		return updateUser;
	}
	
	public String searchPassword(String userName, String email) {
		Optional<User> result = repository.findPassword(userName, email);
		if(result.isEmpty())
			return "해당 계정은 존재하지 않습니다.";
		return result.get().getPassword();
	}
}
