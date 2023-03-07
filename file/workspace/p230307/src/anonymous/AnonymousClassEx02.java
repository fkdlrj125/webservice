/*
 * 	[형태] 익명 클래스
 * 	1. 클래스 확장
 * 	2. 인터페이스 구현
 * 	3. 인수 
 */

package anonymous;

class Super {
	public void info() {
		System.out.println("[Super class] info() 실행됨");
	}
	
	public void greeting() {
		System.out.println("안녕 좋은 아침");
	}
}

class Sub extends Super{				// 클래스의 확장 -> 자식의 멤버에 부모의 멤버를 더함
	
	public Sub() {
		System.out.println("[Sub class] 생성자 실행됨");
	}
	
	public void show() {
		System.out.println("[Sub class] show() 실행됨");
	}
}

public class AnonymousClassEx02 {
	public static void main(String[] args) {
		
		// 다형성
//		Super s = new Sub();
		
		// 익명 클래스 - 클래스 확장
		Super anonymous = new Super() {		
			// 생성자 불가능 -> 클래스명 X
			
			// Super의 자식이라 오버라이딩 가능
			@Override
			public void info() {
				System.out.println("[Anonymous class] 오버라이딩된 메소드 info()");
			}
			
			public void say() {
				System.out.println("나는 익명 클래스");
			}
			
		};
		
		anonymous.info();
//		anonymous.say();		// 익명클래스 내에서 생성된 인스턴스 메소드는 외부에서 호출 불가능
		anonymous.greeting();	// 오버라이딩된 메소드와 부모의 메소드만 사용 가능
	}
}
