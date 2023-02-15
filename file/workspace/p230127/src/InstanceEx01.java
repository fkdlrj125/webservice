/*
 * 	[클래스] class
 * 	- 자료형 중 하나
 *	 	
 * 	기본 자료형(primitive type) : int, float, double, ...
 * 	사용자 정의 자료형(참조 자료형,reference type) : String, class, ...
 * 	
 * 	- 클래스명은 대문자 시작(반드시 문자로 시작)
 * 	- 클래스 내 멤버 : 변수, 메소드, 클래스
 *	
 *	[객체] object, instance
 * 	- 클래스로 생성된 구체화(실체화)된 대상
 * 	- Java는 모든 객체를 heap 영역에 생성 -> 멤버도 heap 영역에 할당
 * 	- 객체는 heap 영역에 생성되면, 할당된 주소를 리턴(반환)
 * 	- 생성된 객체는 반드시 주소를 통해 접근(참조 변수에 저장된 주소)
 * 	- Java는 멤버 변수를 자동으로 초기화(주소값은 null로 저장)	
 * 
 * 	- 객체 생성 문법
 * 	new(heap영역에 할당시키는 연산자) 클래스명();
 * 
 * 	- 참조(reference) 변수 선언 문법
 * 	클래스명 변수명;	
 * 
 */


public class InstanceEx01 {
	public static void main(String[] args) {
		Student lee = new Student(); //생성된 객체는 참조변수에 저장된 주소값을 통해 접근
		lee./*접근 연산자*/age=27;
		lee.name="Jung Hyeon";
		lee.printInfo();
		lee.study();
		
		Student leeTwo = lee;
		System.out.println("[leeTwo] age >> "+leeTwo.age);
	}
}

// [클래스 정의]
class Student{
	int age;
	String name;
	void study() {
		System.out.println("공부 중 입니다...");
	}
	void printInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}

