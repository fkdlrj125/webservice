/*
 * 	[다형성]
 * 	 - 부모의 참조변수로 자식 객체를 가리킴 / 자식의 정보를 보지 않음
 * 	 - 오버라이딩된 메소드는 테이블에 저장
 *     오버라이딩된 메소드 실행되면 자식의 오버라이딩된 메소드를 찾아감
 *   - 부모의 타입으로 자식 메소드를 쓰기 위해 사용
 *     1. 오버라이딩된 메소드
 *     2. 강제형변환을 통해 자식의 메소드 접근
 */
class fruit {

}

class Parent {
	private int money = 1_000_000;

	public void spend(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "입니다.");
		System.out.println("=============================================");
	}

	public void working() {
		System.out.println("부모님은 열심히 일하는 중입니다.");
		System.out.println("=============================================");
	}
}

class Son extends Parent {
	public void play() {
		System.out.println("노는 중~~~");
		System.out.println("=============================================");
	}

	@Override
	public void spend(int money) {
		System.out.println("<<오버라이딩된 메소드>>");
		System.out.println("용돈 " + money + "원 주세요");
		System.out.println("=============================================");
	}
}

class Daughter extends Parent {
	public void study() {
		System.out.println("공부 중~~~");
		System.out.println("=============================================");
	}

	@Override
	public void spend(int money) {
		System.out.println("[[오버라이딩된 메소드]]");
		System.out.println("학원비 " + money + "원 주세요~");
		System.out.println("=============================================");
	}

}

public class PolymorphismEx01 {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Parent p2 = new Son();			
//		p2.spend(100);
		Parent p3 = new Daughter();
//		p3.spend(10_000);
		
//		다형성은 부모의 참조변수가 자식 객체를 가리키는 것
//		Daughter d = new Parent(); 
		
//		[객체 배열]
//		1. 객체 배열 생성 후 초기화
//		Parent[] p4 = new Parent[2];
//		p4[0] = new Son();
//		p4[1] = new Daughter();
//		2. 객체 배열 생성과 동시에 초기화
		Parent[] p4 = {new Son(),new Daughter()};
		p4[0].spend(10000);
		p4[1].spend(10000);
		
//		[형변환]
//		자식 -> 부모 (자동 형변환/upcasting)
		Son sn = new Son();
		Parent pt = sn;
		pt.spend(1000);
//		부모 -> 자식 (강제 형변환/downcasting)
		Parent pr = new Son();
		Son so = (Son)pr;
		so.spend(1000);
//		부모 자식관계만 가능		
//		Fruit f = (Fruit)sn
		
//		형변환 가능 여부
//		[문법] 참조변수 or 객체 instance 클래스
		System.out.println(pr instanceof Son); 
		System.out.println(pr instanceof Parent);
		System.out.println(p instanceof Parent);
		System.out.println(pr instanceof Son);
		Daughter d= new Daughter();
	}
}
