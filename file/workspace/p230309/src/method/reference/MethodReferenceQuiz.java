package method.reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}

public class MethodReferenceQuiz {
	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for(T t:list)
			consumer.accept(t);
	}
	public static void main(String[] args) {
		List<Person> person = new ArrayList<>();
		person.add(new Person("홍길동", 29));
		person.add(new Person("박보검", 35));
		person.add(new Person("이미자", 52));
		
		// [문제 1] 정의한 forEach문 사용
		// [문제 1-1] 이름과 나이를 출력
		// [람다]
		System.out.println("<< Member forEach lambda >>");
		Consumer<Person> lambdaConsumer = (Person p) -> System.out.println(p);
		forEach(person, lambdaConsumer);
		
		// [메소드 출력]
		System.out.println("\n<< Member forEach Method Reference >>");
		Consumer<Person> referenceConsumer = lambdaConsumer::accept;
		forEach(person, referenceConsumer);
		
		// [문제 1-2] 이름만 출력 : getName()
		// [람다]
		System.out.println("\n<< Member forEach lambda >>");
		Consumer<Person> lambdaName = (Person p) -> System.out.println(p.getName());;
		forEach(person, lambdaName);
		
		// [메소드 출력]
		System.out.println("\n<< Member forEach Method Reference >>");
		Consumer<Person> referenceName = lambdaName::accept;
		forEach(person, referenceName);
		
		// [문제 2] ArrayList의 forEach문 사용
		// [문제 2-1] 이름과 나이를 출력 : toString()
		// [람다]
		System.out.println("\n<< ArrayList forEach lambda >> ");
		((ArrayList<Person>)person).forEach(lambdaConsumer);
		
		// [메소드 참조]
		System.out.println("\n<< ArrayList forEach Method Reference >> ");
		((ArrayList<Person>)person).forEach(referenceConsumer);
		
		// [문제 2-2] 이름만 출력 : getName()
		// [람다]
		System.out.println("\n<< ArrayList forEach lambda >> ");
		((ArrayList<Person>)person).forEach(lambdaName);
		Math.max(0, 0)
		// [메소드 참조]
		System.out.println("\n<< ArrayList forEach Method Reference >> ");
		((ArrayList<Person>)person).forEach(referenceName);
	}
}
