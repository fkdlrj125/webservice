/*
 * 	[정적 사이트]
 * 	- 모든 사용자가 같은 페이지를 보는 사이트
 * 	- 서버에 요청하면 바로 보내주는 사이트
 * 	
 * 	[동적 사이트]
 * 	- 사용자마다 다른 페이지를 보는 사이트
 * 
 * 	[SpringBoot]
 * 	- Spring Container 안에서 객체를 1개만 생성해 사용(Singleton)
 * 	- SpringBoot의 라이브러리를 쉽게 가져다 쓸 수 있게 spring.io 사이트에서 
 * 	  프로젝트를 생성
 * 		- [프로젝트 종류] - 의존도의 차이
 * 			- [Gradle]
 * 				- 자바문법 사용
 * 				- build.gradle에서 spring-boot-starter를 이용해 라이브러리를 쉽게 관리
 * 				ex) implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
 * 			- [Maven]
 * 				- XML 사용
 * 				- pom.xml에서 라이브러리를 관리
 * 				ex)	<dependency>
				   	<groupId>org.springframework.boot</groupId>
				   	<artifactId>spring-boot-starter-test</artifactId>
				   	<scope>test</scope>
				   	</dependency>
 * 
 * 		- SNAPSHOT은 안정화되지 않은 버전
 * 		- Jar : 내장톰켓
 * 		- War : 외장톰켓
 * 		
 * 		- [Dependencies]
 * 			- 필수
 * 				- Spring Web - 웹 서버 연결
 * 				- Thymeleaf	- db 연결
 * 
 * 		- Import - Gradle로 생성
 * 
 * 	- main에 있는 자바파일은 서버 실행
 * 	- test에 있는 자바파일은 작업 테스트
 * 	
 * 	- resources는 웹과 관련된 폴더
 * 		- static 	: 정적 페이지(static content)  - tomcat이 기본적으로 static에서 index.html을 찾음
 * 								  					 static에 없다면 templates에서 찾음
 * 
 * 		- templates : 동적 페이지(dynamic content) - 서버언어(Server side language)를 사용해서 코드작성 
 * 													 대표적인 언어는 JSP 최은 Thymeleaf를 많이 사용함
 * 												   - templates에 파일을 추가하거나 수정하면 반드시 서버를 재실행
 * 												   
 *		- index.html은 추가했을 때 Tomcat Contanier에 정보를 넣어줘야함
 *		  그래서 서버를 재실행해야 인식가능 다른 파일들은 재실행 안해도 인식가능
 * 		
 * 	- build.gradle - 라이브러리 설정
 * 	- settings.gradle
 *	
 *	- 메뉴줄에 실행버튼 옆에 서버 종료버튼 
 *	- 서버 종료버튼 옆에 재실행버튼
 *
 *	- 정적 파일이 아닌 파일(동적 파일)을 요청하면 controller가 동적파일을 찾아
 *	  thymeleaf나 jsp같은 서버쪽 언어를 처리하고 viewResolver가 사용자에게 전송
 */
public class SpringBootEx01 {

}
