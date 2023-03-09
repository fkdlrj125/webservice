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
		
		// [메소드 참조]
//		메소드 참조는 정의된 메소드의 body를 가져와서 사용하는 형태다 
//		현재는 Consumer functionalInterface의 accept 메소드를 오버라이딩해서 
//		그 메소드를 참조하는 형태인데 이 상태에서는 람다식을 사용하면 현재 참조할려는
//		메소드의 타입을 알 수 없기 때문에 사용할 수 없다
		System.out.println("\n<< Member forEach Method Reference >>");
		Consumer<Person> referenceConsumer = new Consumer<Person>() {		  
			@Override														
			public void accept(Person t) {									
				System.out.println(t);
			}
		}::accept;	
		forEach(person, referenceConsumer);
		
		// [문제 1-2] 이름만 출력 : getName()
		// [람다]
		System.out.println("\n<< Member forEach lambda >>");
		Consumer<Person> lambdaName = (Person p) -> System.out.println(p.getName());;
		forEach(person, lambdaName);
		
		// [메소드 참조]
		System.out.println("\n<< Member forEach Method Reference >>");
		Consumer<Person> referenceName = new Consumer<Person>() {
			@Override
			public void accept(Person t) {
				System.out.println(t.getName());
			}
		}::accept;
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
		
		// [메소드 참조]
		System.out.println("\n<< ArrayList forEach Method Reference >> ");
		((ArrayList<Person>)person).forEach(referenceName);
	}
}
