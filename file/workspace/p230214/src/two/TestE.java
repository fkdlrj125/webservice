package two;

import one.TestA;

public class TestE extends TestA {
	void show() {
//		System.out.println(num1);		
//		System.out.println(num2);
		System.out.println(super.num3); // 상속은 사용가능
		System.out.println(num4);
	}
}
