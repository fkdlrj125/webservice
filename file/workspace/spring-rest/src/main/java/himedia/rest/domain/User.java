package himedia.rest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//application.properties에 추가 spring.jpa.hibernate.ddl-auto=create -> 서버가 실행되면 자동으로 테이블 드랍 후 생성 

@Entity	// 테이블 자동 생성
@Setter @Getter 
@NoArgsConstructor // 매개변수 없는 생성자
@Table(name = "users") // 테이블명 설정
public class User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) // @Id : 아이디로 설정, @GeneratedValue : auto-increment 설정
	private Long id;
	private String name;
	private int age;
}
