package colllection;

import java.util.ArrayList;

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

public class ArrayListQuiz {
	public static void main(String[] args) {
		Person hong = new Person("홍길동", 25);
		Person park = new Person("박보검", 35);
		Person lee = new Person("이미자", 52);
		
//		[문제] ArrayList에 hong, park, lee을 저장하시오.
		ArrayList<Person> arraylist = new ArrayList<Person>();
		arraylist.add(hong);
		arraylist.add(park);
		arraylist.add(lee);
		arraylist.add(new Person("홍길동",47));
		
		System.out.println("<< 저장된 이름 전체 출력 >>");
		for(Person p : arraylist) {
			System.out.println(p.getName());
		}
		
		System.out.println();
		for(Object o : arraylist.toArray()) {
			System.out.println(((Person)o).getName());		//down casting Object to Person
		}
		
		System.out.println("\n<< 저장된 전체 요소 개수 >>");
		System.out.println(arraylist.size());
		
		System.out.println("\n<< 인덱스 1의 이름 >>");
		System.out.println(arraylist.get(1).getName());
		
		System.out.println("\n<< 35세 박보검 포함 여부 >>");
		System.out.print("박보검 있나요? >> ");
//		System.out.println(arraylist.contains(park));
		for(Person p : arraylist) {
			if(p.getName().equals("박보검") && p.getAge() == 35)
				System.out.println(true);
		}
		
		System.out.println("\n<< 52세 이미자 포함 여부 >>");
		System.out.print("이미자 있나요? >> ");
//		System.out.println(arraylist.contains(lee));
		for(Person p : arraylist) {
			if(p.getName().equals("이미자") && p.getAge() == 52)
				System.out.println(true);
		}
		
		System.out.println("\n<< 홍길동 이름을 화이팅으로 변경 >>");
		for(Person p : arraylist) {
			if("홍길동".equals(p.getName())) {					// 비교주체는 고정된 값으로 하는 것이 좋음
				p.setName("화이팅");
			}
			System.out.println(p.getName());
		}
	}
}
