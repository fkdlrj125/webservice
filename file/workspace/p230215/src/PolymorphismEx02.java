
class Animal {

	private int age;
	private String name;

	public Animal() {
	}

	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void showInfo() {
		System.out.println("동물입니다.");
	}

}

class Cat extends Animal {

	public Cat(int age, String name) {
		super(age, name);
	}

	@Override
	public void showInfo() {
		System.out.println("=========================================================");
		System.out.println("나이 : " + super.getAge() + " 이름 : " + super.getName());
		System.out.println("=========================================================");
	}
}

class Dog extends Animal {

	public Dog(int age, String name) {
		super(age, name);
	}

	@Override
	public void showInfo() {
		System.out.println("=========================================================");
		System.out.println("나는 강아지입니다.");
		System.out.println("나이는 " + super.getAge() + "살, 이름은 " + super.getName() + "입니다.");
		System.out.println("=========================================================");
	}

}

public class PolymorphismEx02 {
	public static void main(String[] args) {

//		단형성
//		Cat mimi = new Cat(5, "미미");
//		Dog hoya = new Dog(3, "호야");
//		다형성
		Animal[] animal = { new Cat(5, "미미"), new Dog(3, "호야") };
		animal[0].showInfo();
		animal[1].showInfo();
	}
}
