package pattern;

class Dog{
	int age=5;
	
	public void showAge() {
		System.out.println("나이 >> "+age);
	}
	
	public void createInstance() {
		//자기 자신을 객체로 만들어서 사용가능
		Dog dog = new Dog();
	}
}

public class ClassType {
	public static void main(String[] args) {

	}
}
