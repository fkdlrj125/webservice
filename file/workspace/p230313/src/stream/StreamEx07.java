package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
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

public class StreamEx07 {
	public static void main(String[] args) {
		// [최종연산] collect ========================================================================================
		// Stream 요소들을 List, Set, Map 등의 type으로 수집
		// ===========================================================================================================
		List<Student> list = Arrays.asList(new Student("홍길동",29),
										   new Student("박보검",35),
										   new Student("이미자",52)); 
		
		// [1. toList() ] 작업 결과를 List 반환 
		List<String> nameList = list.stream().map((Student s) -> s.getName()).collect(Collectors.toList());
		System.out.println("<< List type : 이름 출력 >> "+ nameList);
		
		// [2. joining() ] 작업 결과를 문자열로 이어움
		// Collectors.joining(구분자, 결과 맨 앞에 붙는 문자, 결과 맨 뒤에 붙는 문자)
		String strOne = list.stream()
							.map(Student::getName)			// 추정이 가능할 때는 instance 메소드도 static처럼 사용가능
//							.map((Student s) -> s.getName())
							.collect(Collectors.joining());
		System.out.println("<< 문자열 이어줌 1>> 이름 사이에 공백없이 출력 " + strOne);
		
		String strTwo = list.stream()
				.map(Student::getName)			
				.collect(Collectors.joining("-"));
		System.out.println("<< 문자열 이어줌 2>> 이름 사이에 - 추가하여 출력 " + strTwo);
		String strThree = list.stream()
				.map(Student::getName)	
				.collect(Collectors.joining("-", "<", ">"));
		System.out.println("<< 문자열 이어줌 1>> 이름 사이에 공백없이 출력 " + strThree);
	}
}
