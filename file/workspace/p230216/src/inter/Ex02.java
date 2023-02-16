package inter;

/*
 * 	[interface] 인터페이스
 * 	 - 추상 클래스보다 엄격해진 자료형
 * 	 - 추상 클래스의 upgrade된 자료형
 * 	 - 객체 생성 불가능 -> 다형성(type)과 상속으로 사용
 * 	 - interface의 field(변수)는 무조건 public static final로 고정
 * 	 - interface의 method는 무조건 public abstract(추상 메소드)로 고정
 */

interface Variable{
	int num1 = 100;
	static int num2 = 200;
	final int num3 = 300;
	public static final int num4 = 400;
}

public class Ex02 {
	public static void main(String[] args) {
//		1. 객체 생성 불가
//		Variable var = new Variable();
		
//		2. 멤버 변수 출력
//		interface의 필드는 무조건 public static final로 고정
		System.out.println(Variable.num1);
//		Variable.num1=1;
		System.out.println(Variable.num2);
		System.out.println(Variable.num3);
		System.out.println(Variable.num4);
	}
}
