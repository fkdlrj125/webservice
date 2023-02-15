/*
 * 	[상속]
 * 	- 클래스의 공통 부분을 효율적으로 처리하기 위해 사용
 * 	
 * 
 */

class Parent{
	int money = 1_000_000;		// _를 이용해 천단위로 나눠 볼 수 있음
	
	public Parent() {
		System.out.println("[Parent] 생성자 실행됨");
	}
	
	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈은 "+this.money+"입니다.");
	}
	
}

class Child extends Parent{
	public Child() {
		System.out.println("[Child] 생성자 실행됨");
	// super()는 자동으로 실행
	// 자식의 생성자에서 자동으로 부모의 생성자로 넘어감
	}
}

public class InheritanceEx01 {
	public static void main(String[] args) {
		
		Child child1 = new Child();
		child1.buy(100000);
	}
}
