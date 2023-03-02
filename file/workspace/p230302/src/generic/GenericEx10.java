package generic;

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class GenericEx10 {
	public static <T> void showArray(T[] t) {
		for(T type: t) {
			System.out.println(type);
		}
	}
	
	public static void main(String[] args) {
		String[] str = {"안녕~", "좋은 오후~"};
		showArray(str);
		Person[] pstr = {new Person("홍길동"), new Person("박보검")};
		showArray(pstr);
	}
}
