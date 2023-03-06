/*
 * =========================================================================================================================
 *
 * 	[inner 클래스]
 * 	- 클래스 내부에 선언된 또 다른 클래스(안에 들어온 클래스를 타입으로 사용하기 위해 사용)  
 *	- Outer class(외부 클래스)와 Inner class(내부 클래스)는 서로 긴밀한 관계를 맺고 있을 때
 *	  선언 가능
 *
 *	<장점>
 *		- Inner class(내부 클래스)는 Outer class(외부 클래스)의 멤버에 접근 가능
 *		- 서로 관련 있는 클래스를 논리적으로 묶어 표현함으로서, 코드의 캡슐화를 
 *		  증가
 *		- 외부에서 Inner class(내부 클래스)에 접근할 수 없으므로, 코드의 복잡성을 
 *		  줄일 수 있음
 *
 *	<종류>
 *		1. 인스턴스 클래스(일반 중첩 클래스)
 *		- instance inner class(inner class)
 *			- Outer class 영역에 선언된 Inner class 중 static 키워드를 가지지 않은 클래스
 *			- Outer class의 field나 method에 사용될 목적으로 정의
 *			- class 관리 효율 높임
 *
 *		2. 정적 클래스(static 중첩 클래스)
 *		- static inner class
 *			- Outer class 영역에 선언된 Inner class 중 static 키워드를 가진 클래스
 *			- 주로 Outer class의 static method에서 사용될 목적으로 정의
 *
 *		3. 지역 클래스(local 중첩 클래스)
 *		- local inner class
 *			- Outer class의 method나 constructor에 선언된 클래스 -> body 내 정의된 클래스
 *			- 선언된 블록 내에서만 사용(접근) 가능
 *
 *		4. 익명 클래스(anonymous 중첩 클래스)
 *		- anonymous inner class
 *			- 다른 inner class와 달리 이름없는 클래스
 *			- 클래스 정의와 동시에 객체 생성하므로, 일회용 클래스 -> 단 하나의 객체만 생성 가능
 *			- 생성자를 정의할 수 없음
 *			- 매우 제한적으로 사용
 *			- 오버라이딩하여 함수 재정의 목적
 *			- [문법]
 *				클래스명 참조변수 = new 클래스명(){};
 *
 *	=========================================================================================================================
 */

package inner;

import inner.Outer.Inner;

class Outer { // Outer class(외부 클래스)
	class Inner { // Inner class(내부 클래스)
		int num;

		public Inner(int num) {
			this.num = num;
		}

		void showNum() {
			System.out.println("[inner class] num >> " + this.num);
		}
	}

}

public class InstanceClassEx01 {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner(1);  // 객체(Outer의 주소를 저장한 out) 내 클래스 Inner 접근해서 생성
		in.showNum();
	}
}
