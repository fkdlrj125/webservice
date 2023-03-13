package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
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

public class OptionalQuiz {
	public static Optional<Person> findByName(String name) {
		List<Person> result = Arrays.asList(new Person("홍길동", 29),
											new Person("박보검", 35),
											new Person("이미자", 52));
		// 매개변수 name이 result에 저장되어 있으면, 객체의 주소 리턴
		for(Person p : result) {
			if(p.getName().equals(name))
				return Optional.ofNullable(p);
		}
		// result에 저장되어 있지 않으면, null
		return Optional.empty();
	}
	public static void main(String[] args) {
		if(findByName("박보검").isPresent())
			System.out.println("박보검 찾아라! >> " + findByName("박보검").get().getName());
		if(findByName("하늘").isPresent())
			System.out.println("하늘 찾아라! >> " + findByName("하늘").get().getName());
	}
}
