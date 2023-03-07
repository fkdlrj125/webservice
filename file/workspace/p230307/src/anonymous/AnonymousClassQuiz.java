package anonymous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

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
	public static void main(String[] args) {
		HashSet<Person> hashset = new HashSet<Person>();/*
														 * {
														 * public String sort(){
														 * Comparator<String> comparator = new Comparator<String>() {
														 * 
														 * @Override
														 * public int compare(String s1, String s2) {
														 * return s1.compareTo(s2);
														 * }
														 * };
														 * Object[] parray = this.toArray();
														 * Object copy;
														 * for(int i = 0; i < parray.length; i++){
														 * for(int j = i; j < parray.length; j++){
														 * if(comparator.compare(((Person)parray[i]).getName(),
														 * ((Person)parray[j]).getName())>0){
														 * copy = parray[i];
														 * parray[i] = parray[j];
														 * parray[j] = copy;
														 * }
														 * }
														 * }
														 * return Arrays.toString(parray);
														 * }
														 * 
														 * @Override
														 * public String toString() {
														 * return sort();
														 * }
														 * };
														 */
		hashset.add(new Person("홍길동", 29));
		hashset.add(new Person("박보검", 35));
		hashset.add(new Person("이미자", 52));

		ArrayList<Person> arr = new ArrayList<Person>(hashset);
		Comparator<Person> comparator = new Comparator<Person>() {
			@Override
			public int compare(Person s1, Person s2) {
				return s1.getName().compareTo(s2.getName());
			}
		};

		arr.sort(comparator);
		for (Person o : arr) {
			System.out.println(o.getName());
		}
		// System.out.println(hashset);
		// for(Person o : hashset){
		// System.out.println(o);
		// System.out.println(o.getName());
		// }

		// 출력 : 저장된 순서 확인
		// Iterator<Person> itr = hashset.iterator();
		// while (itr.hasNext()) {
		// System.out.println(itr.next().getName());
		// }

	}
}