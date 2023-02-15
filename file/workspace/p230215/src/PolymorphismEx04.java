class Person{
	@Override
	public String toString() {
		return "나는 Person이다";
	}
}
public class PolymorphismEx04 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
	}
}
