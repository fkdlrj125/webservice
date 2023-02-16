package abstractclass;

// 추상 클래스[abstract class]
// - 추상 메소드를 사용하기 위해선 추상 클래스가 되어야 함
// - 추상 클래스가 무조건 추상 메소드를 가져야되는 건 아님
// - 추상 클래스는 불완전한 멤버를 가지기 때문에 객체를 생성할 수 없음
// - 다형성 또는 상속에만 사용

// 추상 메소드[abstract method]
// - body가 존재하지 않음(정의가 불완전) -> 불완전 메소드 
// - 추상메소드의 끝은 ; 으로 나타냄
// - 상속받은 자식은 무조건 추상메소드를 오버라이딩해야 함
// - 부모가 오버라이딩을 강제하기 위해 사용

abstract class Parent{
	private int num;
	 
	abstract public void methodOne();
	
	public void methodTwo() {
		System.out.println("일반 메소드");
	}
	public static void methodThree() {
		System.out.println("static 메소드");
	}
}

class Child extends Parent{
	@Override
	public void methodOne() {
		System.out.println("오버라이딩된 추상 메소드!!");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		// 1. 추상 클래스는 객체 생성할 때, 에러 발생
//		Parent p = new Parent();
		
		// 2. 추상 클래스를 Type으로 사용 : 참조변수 선언
		Parent p;
		
		// 3. 자식 클래스는 객체 생성 가능
		Child c = new Child();
		c.methodOne();
		
		// 4. 다형성
		Parent pr = new Child();
		pr.methodOne();
	}
}
