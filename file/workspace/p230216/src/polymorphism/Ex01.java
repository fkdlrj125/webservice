package polymorphism;

class Fruit {
	String name;
	int count;

	public Fruit() {
	}

	public Fruit(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	public void show() {
		System.out.println("부모 클래스 Fruit입니다.");
	}
	
}

class Banana extends Fruit {

	public Banana(String name, int count) {
		super(name, count);
	}

	@Override
	public String toString() {
		return "바나나는 멸종 위기이다";
	}
	
	public void nameAndCount() {
		System.out.printf("현재 과일은 %s 입니다.\n개수는 %d개 있습니다\n",name,count);
	}

}

class Apple extends Fruit {

	public Apple(String name, int count) {
		super(name, count);
	}

	@Override
	public String toString() {
		return "나는 사과다!";
	}
	
	public void showInfo() {
		System.out.printf("사과 종류는 %s 입니다.\n수량은 %d개 입니다\n",name,count);
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		Banana banana = new Banana("레드 바나나", 10);
//		System.out.println(banana);
		Apple apple = new Apple("홍옥", 5);
//		System.out.println(apple);
		fruitInfo(banana);
		fruitInfo(apple);
	}

	public static void fruitInfo(Fruit fruit) {
		System.out.println("==== fruitInfo 실행 ====");
		System.out.println(fruit);
		fruit.show();
		if(fruit instanceof Banana) {
			((Banana)fruit).nameAndCount();
		}else if(fruit instanceof Apple) {
			((Apple)fruit).showInfo();
		}
	}
}
