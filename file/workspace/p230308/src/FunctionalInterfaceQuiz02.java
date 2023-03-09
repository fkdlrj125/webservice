import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
}

public class FunctionalInterfaceQuiz02 {	
	public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
		List<T> result = new ArrayList<T>();
		
		for(T t : list) {
			if(predicate.test(t)) {
				result.add(t);
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		List<Person> person = new ArrayList<Person>();
		person.add(new Person("홍길동",29));
		person.add(new Person("박보검",35));
		person.add(new Person("이미자",52));
		
		for(Person p : person) {
			System.out.println(p.getName());
		}
		// 나이가 30세 이상인 데이터(객체)만 추출
//		Predicate<Person> predicate = (Person p) -> p.getAge() >= 30;
		Predicate<Person> predicate = new Predicate<Person>() {
			@Override
			public boolean test(Person t) {
				return t.getAge() >= 30;
			}
		};
		
		List<Person> adult = filter(person,predicate);
		
		for(Person p : adult) {
			System.out.println("30세 이상인 사람 >> "+p.getName());
		}
	}
}
