package collection;

import java.util.HashMap;
import java.util.Map;

class Person {
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

public class HashMapEx02 {
	public static void main(String[] args) {
		Person hong = new Person("홍길동", 25);
		Person park = new Person("박보검", 35);
		
//		[유형 1]
		Map<String, Object> p = new HashMap<String, Object>();			// 다형성, value의 타입을 제한하지 않기 위해 Object타입 사용 
																		// key는 타입을 정확하게 지정하는 것이 좋음
																		// Map의 자식을 다양하게 받기 위해 다형성으로 사용
		p.put("name", hong.getName());
		System.out.println(p);
		
//		[유형 2]
		Map<Integer, Person> member = new HashMap<Integer, Person>();	// 클래스 타입을 자동으로 증가하는 Integer로 관리
		member.put(1, hong);
		member.put(2, park);
		System.out.println(member);
	}
}
