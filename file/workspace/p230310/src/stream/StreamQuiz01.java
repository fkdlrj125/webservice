package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

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
		return this.hashCode() == obj.hashCode();
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
		Stream<Integer> hashcode = list.stream().map((Student s) -> s.hashCode());

		list.stream()
			.distinct()
			.forEach(System.out::println);
	}
}
