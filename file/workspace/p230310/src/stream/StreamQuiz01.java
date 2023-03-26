package stream;

import java.util.Arrays;
import java.util.List;

class Student {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
//		return this.hashCode() == obj.hashCode();
		if(obj instanceof Student) {					// 안정적인 코드를 위해 조건검사 
			return this.name.equals(((Student)obj).name) && this.age == ((Student)obj).age;	// hashcode는 연산된 값이기 때문에 같은 값이 나올 수 있어
																							// 저장된 값도 같은지 비교해준다
		}	
		return false;
	}
}

public class StreamQuiz01 {
	public static void main(String[] args) {
		// Student 1차원 배열
		Student[] students = { new Student("홍길동", 29), new Student("박보검", 35), new Student("이미자", 52),
				new Student("박보검", 35) };

		// Student 1차원 배열 -> List 반환
		List<Student> list = Arrays.asList(students);

		// [Stream] 중복 요소를 제거한 후, 출력
		list.stream()
			.distinct()
			.forEach(System.out::println);
	}
}
