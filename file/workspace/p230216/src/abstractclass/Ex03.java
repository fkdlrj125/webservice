package abstractclass;

abstract class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	abstract public void play();
}

class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println(super.name+"는 낚싯대 놀이 중입니다.");
	}

}

class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println(super.name+"는 터그 놀이 중입니다.");
	}

}

public class Ex03 {
	public static void main(String[] args) {

		Dog roy = new Dog("로이");
		Cat bear = new Cat("베어");
		
		animalPlay(roy);
		animalPlay(bear);
	}
	public static void animalPlay(Animal animal) {

		if(animal instanceof Dog) {
			((Dog)animal).play();
		} else if(animal instanceof Cat) {
			((Cat)animal).play();
		}
		
	}
}
