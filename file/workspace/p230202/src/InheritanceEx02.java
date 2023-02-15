class GrandParent{
	
}

class Parent{
	
	int money;
	
	public Parent() {
		this.money = 1_000_000;
		System.out.println("[Parent] 매개변수가 없는 생성자 실행");
	}
	
	Parent(int money){
		this.money = money;
		System.out.println("[Parent] 매개변수가 1개인 생성자 실행");
	}
	
	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "입니다.");
	}
}


/*	[다중 상속] : 부모가 2개 이상 => Java는 불가능
 * 	[단일 상속] : 부모가 1개 => Java는 단일 상속만 허용
 */
//class Child extends Parent,GrandParent{
class Child extends Parent{
	public Child() {
		System.out.println("[Child] 생성자 실행됨");
	}
	
	public Child(int money) {
		super(money);
		System.out.println("[Child] 매개변수가 1개인 생성자 실행됨");
	}
	
/*
 * 	[오버라이딩]
 * 	- 상속 관계에서 자식(sub)class가 부모(super)class의 멤버 메소드를 재정의
 * 	- 부모class의 멤버 메소드에서 선언부는 그대로, 바디(기능)만 수정
 * 	- 반환형, 메소드명, 매개변수 정보가 같아야 함
 */
	void buy(int money) {
		System.out.println("용돈 " + money + "원 주세요.");
	}
	
}


public class InheritanceEx02 {
	public static void main(String[] args) {
		Child child1 = new Child();
		child1.buy(100000);
		
		Child child2 = new Child(500_000);		// 자동으로 추가되는 super()는 매개변수X
		child2.buy(10000);
	}
}