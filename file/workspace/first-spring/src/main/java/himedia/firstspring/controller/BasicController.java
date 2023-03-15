package himedia.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/basic")
public class BasicController {

	/**
	 * [문서 주석] Java Documentation Comment
	 */

	/**
	 * [view 저장 위치에 따른 웹 개발 종류]
	 * ========================================================
	 * 
	 * [파일 위치] [처리]
	 * ------------------------------------------------------------------------- 1.
	 * static content | resources/static | X | 2. dynamic content |
	 * resources/templates | ViewResolver | 3. API | X | HttpMessageConverter |
	 * -------------------------------------------------------------------------
	 * 
	 * 1. static contents - 서버에서 파일을 그대로 웹 브라우저에 전송
	 * 
	 * 2. dynamic contents - 서버에서 HTML을 동적 변경(처리)하여 웹 브라우저에 전송
	 * 
	 * - Mapping을 통해 해당 handler를 찾아 서버언어를 처리한 후 ViewResolver가 처리결과를 템플릿
	 * 엔진(Thymeleaf)을 이용해 html에 적용시킨 후 전송
	 * 
	 * - 파일 위치 : resources/templates/{ViewName}.html
	 * 
	 * - MVC : Model(data), View(html), Controller(handler)
	 * 
	 * 3. API - JSON 포멧(형식)으로 데이터 전송(문자열도 가능함)
	 *
	 * - 객체를 넘길 수 있음(클라이언트한테 전송) : HttpMessageConverter가 객체를 JSON으로 변환
	 *
	 * =============================================================================================
	 */

	/**
	 * 2-1. MVC : handler(handler level mapping)
	 */
	@GetMapping("/first-mvc")
	public String firstMvc() {
		return "basic/first"; // 논리적 뷰
	}

	/*
	 * [문제] bestseller 요청에 대한 응답 페이지를 bestseller.html로 하시오.
	 */
	@GetMapping("/bestseller")
	public String bestseller() {
		return "basic/book/bestseller";
	}

	/**
	 * 2-2. MVC : view template을 통해 데이터 표현 : template engine - thymeleaf
	 * 	- 데이터에 문자열을 연결하는 법
	 * 
	 * 		1. 타임리프 값에 문자열을 + 로 연결해줌(문자열은 ''로 표현)
	 * 		ex) th:text="${name} + ' 님, 안녕하세요!'"
	 */
	@GetMapping("/second-mvc")
	public String secondMvc(Model model) {
		model.addAttribute("name", "홍길동");
		return "basic/second";
	}
	
	/**
	 * 	2-3. MVC : 쿼리 파라미터(query parameter) 처리
	 * 	- 쿼리 파라미터에 한글을 적으면 인코딩되어 전송된다
	 * 	- 쿼리 파라미터가 있을 때 쿼리 파라미터를 전달해주지 않으면 에러발생
	 */
	@GetMapping("/third-mvc")
	public String thirdMvc(@RequestParam("fruit") String fruit, Model model) {
		System.out.println("fruit >> "+fruit);
		System.out.println("[요소 추가 전] model >> "+model);
		model.addAttribute("fruit", fruit);
		System.out.println("[요소 추가 후] model >> "+model);
		return "basic/third";
	}
	
	/*
	 * 	[문제] /fruit?count=7 
	 * 	쿼리 파라미터의 값을 quiz-fruit-count 뷰에 표현
	 * 	쿼리파라미터 키이름과 매개변수명이 같으면 키이름 생략 가능
	 */
	/*
	 * 	[문제] /fruit?count=7&sort=딸기
	 */
	@GetMapping("/fruit")
	public String fruit(@RequestParam int count,@RequestParam String sort , Model model) {
//		model.addAttribute("count", count);
//		model.addAttribute("sort", sort);
		model.addAttribute("count", count)
			 .addAttribute("sort", sort);
		return "basic/quiz-fruit-count";
	}
	
	/**
	 * 	3-1-1. API
	 * : String 전송
	 * : 응답을 하는 페이지의 body에 담아서 전송
	 */
	@GetMapping("/api-one")
	@ResponseBody
	public String apiOne() {
		return "문자열로 리턴합니다.";
	}
	
	/**
	 * 	3-1-2. API
	 * : String 전송
	 * : 어노테이션이 있으면 생성된 뷰가 있어도 문자열로 전달
	 */
	@GetMapping("/api-test")
	@ResponseBody				
	public String apiTest() {
		return "test";
	}
	
	/**
	 * 	3-2. API
	 * 	: 객체를 사용자에게 전달할 때 json 형식으로 전송
	 */
	@GetMapping("/api-two")
	@ResponseBody
	public Student apiTwo(@RequestParam String name, @RequestParam int age) {
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		return student;
	}
	
	class Student {
		private String name;
		private int age;
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}
}
