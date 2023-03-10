package method.reference;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class Person {
	private String name;
	private int age;
	
	public Person() {
	}

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
	
	public void returnName() {
		System.out.println(getName()); 
	}
	public void returnName(Person p) {
		System.out.println(getName()); 
	}
}

public class MethodReferenceQuiz {
	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T t : list)
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

		// [메소드 참조]
//		==== 틀림 - 메소드의 매개변수를 가공하지 않은 메소드면 람다식 축약가능 ==========
//		메소드 참조는 정의된 메소드의 body를 가져와서 사용하는 형태다 
//		현재는 Consumer functionalInterface의 accept 메소드를 오버라이딩해서 
//		그 메소드를 참조하는 형태인데 이 상태에서는 람다식을 사용하면 현재 참조할려는
//		메소드의 타입을 알 수 없기 때문에 사용할 수 없다
		System.out.println("\n<< Member forEach Method Reference >>");
		Consumer<Person> referenceConsumer = System.out::println;		// 람다식을 축약한 형태
		forEach(person, referenceConsumer);
//		=================================================================================

		// [문제 1-2] 이름만 출력 : getName()
		// [익명 클래스]
		System.out.println("\n<< Member forEach anonymous >>");
//		forEach(person, new Consumer<Person>() {
//			@Override
//			public void accept(Person p) {
//				System.out.println(p.getName());
//			}
//		});
		forEach(person, new Consumer<Person>() {
			@Override
			public void accept(Person p) {
				p.returnName();
			}
		});

		// [람다]
		System.out.println("\n<< Member forEach lambda >>");
//		Consumer<Person> lambdaName = (Person p) -> System.out.println(p.getName());
		Consumer<Person> lambdaName = (Person p) -> p.returnName();
		forEach(person, lambdaName);

		// [메소드 참조]
//		메소드의 매개변수를 가공하기 때문에 람다식 축약불가
		System.out.println("\n<< Member forEach Method Reference >>");
		forEach(person, lambdaName::accept);
//		Consumer<Person> referenceName = new Person()::returnName;				// 매개변수를 하나 입력받기 때문에 error
//		forEach(person, referenceName);

		// [문제 2] ArrayList의 forEach문 사용
		// [문제 2-1] 이름과 나이를 출력 : toString()
		// [람다]
		System.out.println("\n<< ArrayList forEach lambda >> ");
		((ArrayList<Person>) person).forEach((Person p) -> System.out.println(p));
		person.forEach((Person p) -> System.out.println(p));
		
		// [메소드 참조]
		System.out.println("\n<< ArrayList forEach Method Reference >> ");
		((ArrayList<Person>) person).forEach(System.out::println);

		// [문제 2-2] 이름만 출력 : getName()
		// [람다]
		System.out.println("\n<< ArrayList forEach lambda >> ");
		((ArrayList<Person>) person).forEach((Person p) -> System.out.println(p.getName()));

		// [메소드 참조]
		System.out.println("\n<< ArrayList forEach Method Reference >> ");
		((ArrayList<Person>) person).forEach(new Person()::returnName);
			
	}
}
