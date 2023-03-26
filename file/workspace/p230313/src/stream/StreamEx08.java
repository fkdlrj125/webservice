package stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx08 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동",29),
											new Student("박보검",35),
											new Student("이미자",52));
		System.out.println("1. findAny()");			// 요소가 1개일 땐 findAny 쓰는게 빠름
		list.stream()
			.findAny()								
			.ifPresent((Student s) -> System.out.println(s.getName()));
		
		System.out.println("\n2. findFirst()");
		list.stream()
			.findFirst()
			.ifPresent((Student s) -> System.out.println(s.getName()));
		
		// 요소 모두 삭제
		list.clear();
		
		System.out.println("\n3. 모든 요소 삭제 후 : findAny()");
		list.stream()
			.findAny()
			.ifPresent((Student s) -> System.out.println(s.getName()));
	}
}
