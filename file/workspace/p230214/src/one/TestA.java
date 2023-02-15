package one;

public class TestA {
	/*
	 *  [접근 제어자(접근 권한, 접근 제한자)] access modifier
	 * 	 - private 	<	 default	 <	 protected 	<	 public
	 * 	  클래스 내 / 같은 패키지 / 다른 패키지내 상속만 / 누구나
	 */
	// field : 멤버 변수
	
	private int num1; 
	int num2; 			// 접근 권한자가 적혀있지 않은 상태가 default 
	protected int num3; 
	public int num4;
	
	// method : 멤버 메소드
//	void show() {
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
//	}
}
