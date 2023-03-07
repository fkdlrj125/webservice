package anonymous;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.printf("이름 : %s, 나이 : %d\n", name, age);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class AnonymousClassQuiz {
//	public static Object[] sort(HashSet<Person> hashset, Comparator<String> comparator) {
//		Object[] o = hashset.toArray();
//		Object pocket;
//		for(int i = 0 ; i < o.length; i++) {
//			for(int j = i+1; j < o.length; j++) {
//				if(comparator.compare(((Person)o[j-1]).getName(), ((Person)o[j]).getName()) > 0) {
//					pocket = o[j-1];
//					o[j-1] = o[j];
//					o[j] = pocket;
//				}
//			}
//		}
//		for(Object obj : o) {
//			System.out.println(((Person)obj).getName());
//		}
//		return o;
//	}
	public static void main(String[] args) {
		HashSet<Person> hashset = new HashSet<Person>() {
			@Override
			public String toString() {
				Comparator<String> comparator = new Comparator<String>() {
					@Override
					public int compare(String s1, String s2) {
						System.out.println(s1);
						System.out.println(s2);
						System.out.println(s1.compareTo(s2));
						return s1.compareTo(s2);
					}
				};
				Person person;
				Object[] parray = this.toArray();
				for (int i = 0; i < parray.length; i++) {
					Iterator<Person> itr = this.iterator();
					int count=0;
					while (itr.hasNext()) {
						System.out.println("count >> "+count++);
						System.out.println("index >> "+i);
						person = itr.next();
						if (comparator.compare(((Person)parray[i]).getName(), person.getName()) > 0) {
							
						}
//						System.out.println(comparator.compare(((Person)parray[i]).getName(), person.getName()));
					}
//					System.out.println(parray[i]);
				}
				return Arrays.toString(parray);
			}
		};
		hashset.add(new Person("홍길동", 29));
		hashset.add(new Person("박보검", 35));
		hashset.add(new Person("이미자", 52));
		System.out.println(hashset);

		// 출력 : 저장된 순서 확인
		Iterator<Person> itr = hashset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getName());
		}

	}
}
