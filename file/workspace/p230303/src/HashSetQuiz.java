import java.util.HashSet;

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
	
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return (p.name+p.age).equals(this.name+this.age) ;
	}
	
}

public class HashSetQuiz {
	public static void main(String[] args) {
		Person hong = new Person("홍길동", 25);	
		Person park = new Person("박보검", 35);
		
		HashSet<Person> hashset = new HashSet<Person>();
		
		hashset.add(hong);
		hashset.add(park);
		hashset.add(new Person("이미자",52));
		
		System.out.println("<< 전체 요소 출력 >>");
		for(Person p : hashset) {
			System.out.println("이름 : "+p.getName()+", 나이 : "+p.getAge());
		}
		
		System.out.println("\n<< 새 요소 추가 : 박보검, 35 >>");
		hashset.add(new Person("박보검",35));
		System.out.println("<< 새 요소 추가 후 >>");
		for(Person p : hashset) {
			System.out.println("이름 : "+p.getName()+", 나이 : "+p.getAge());
		}
		System.out.println("<< 해쉬코드 확인 >>");
		for(Person p : hashset) {
			System.out.println("이름 : "+p.getName()+", 해쉬코드 : "+p.hashCode());
		}
	}
}
