/*
 * 	[Local Inner Class]
 * 
 * 	- method 내 정의된 클래스
 * 	- 접근 제어자 사용 불가 -> 지역(method) 내에서만 사용하는 요소이기 때문에 불필요
 *  - static 사용을 권장하지 않음 -> static member 선언을 권장하지 않음
 */


package inner;

class OuterFive {
	public void show() {
//		method 내 정의된 inner class
		class InnerFive {
			int num;

			public InnerFive() {
				this.num = 5;
				System.out.println("[InnerFive class] 생성자 실행됨");
			}

			public void showNum() {
				System.out.println("[InnerFive class] num >> " + num);
			}
		}
		InnerFive inner = new InnerFive();
		inner.showNum();
	}
}

public class LocalClassEx01 {
	public static void main(String[] args) {
		OuterFive outer = new OuterFive();
		outer.show();
	}
}
