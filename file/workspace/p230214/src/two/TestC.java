package two;

import one.TestA;

public class TestC {
	void show() {
		TestA a = new TestA();
//		System.out.println(a.num1); private이라 멤버만 사용가능
//		System.out.println(a.num2); default라 다른 패키지에서 사용불가
//		System.out.println(a.num3);	protected라 상속관계가 아니면 사용불가
		System.out.println(a.num4);
	}
}
