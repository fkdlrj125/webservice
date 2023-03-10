/*
 * 	[메소드 참조 표현식] Method Reference Expression
 * 	- '::' : 이중 콜론 연산자  	
 * 	- 함수형 인터페이스를 람다식이 아닌 일반 메소드를 '참조'하여 선언하는 방법
 * 	
 * 	- functional interface는 반드시 abstract method가 1개
 * 	  (Single Abstract Method : SAM)
 * 	  - @FunctionalInterface 어노테이션으로 보장
 * 
 * 	- 리턴 타입과 파라미터 타입이 동일한 '기존에 구현된' 메서드를 
 * 	  빈 껍데기만 참조하면 더 간편하게 사용할 수 있음
 * 
 * 	- 파라미터를 가공하지 않는다면 람다식을 축약해 바로 연결해서 사용가능
 * 
 * 	- '기존에 구현된 메소드'와 abstract method의 선언부가 완전히 같아야 함
 * 	  단, 메소드명 달라도 됨(상관없음)
 * 	  매개변수 정보(타입, 개수)와 리턴 타입은 동일하고 기능만 다르다는 것이 핵심! 
 *    따라서, abstract method를 완전히 하나의 메소드로 호출 가능
 *    
 *  - 참조 : 주소 -> 특정 메모리를 가리킨다
 *    참조만 하기에, 메소드명만 사용하고 파라미터의 () 제외
 * 	  즉, 주소만 사용함
 * 	  ==========================================================
 * 	  | 이미 정의된 다른 메소드의 body만 가져다 사용하는 형태  |
 * 	  ==========================================================
 * 
 * 	- 참조 가능한 메소드 : instance method, static method, constructor
 * 
 * 	- [문법]
 * 	  1) 참조변수::메소드명 / instance method
 * 		 String::메소드명
 * 	  2) 클래스명::메소드명	/ static method
 * 	  3) 클래스명::new		/ constructor 
 */

package method.reference;

import java.util.function.Supplier;

@FunctionalInterface
interface Fruit{
	String selfIntroduction(String s1, String s2);
}

// 1. class 구현
class Banana implements Fruit{
	
	@Override
	public String selfIntroduction(String s1, String s2) {
		return s1+s2;
	}
}

class Add {
	
	public Add() {
		System.out.println("[Add Class] 생성자 실행됨");
	}
	
	public String instanceAdd(String s1, String s2) {
		return "[이미 정의된 instance method]".concat(s1).concat(", ").concat(s2);
	}
	
	static String staticAdd(String s1, String s2) {
		return "[이미 정의된 static method]".concat(s1).concat(" - ").concat(s2);
	}
}

public class MethodReferenceEx01 {
	public static void main(String[] args) {
//		1. class 구현 후 객체 생성 =====================================================
		Banana banana = new Banana();
		System.out.println(banana.selfIntroduction("안녕 ", "나는 바나나"));
//		================================================================================
		
//		2. 익명 클래스 =================================================================
		System.out.println(new Fruit() {
			@Override
			public String selfIntroduction(String s1, String s2) {
				return "[익명 클래스] ".concat(s1.concat(s2));			// 문자열 연산에서 + 는 컴파일러가 concat()으로 변경
																		// 문자열을 연결할 땐 concat()을 사용하는 것이 좋음
			}
		}.selfIntroduction("안녕하세요 ", "저는 딸기입니다."));
//		================================================================================
		
//		3. 람다 ========================================================================
		Fruit apple = (String s1, String s2) -> "[람다 표현식] ".concat(s1.concat(s2));
		System.out.println(apple.selfIntroduction("Hi ", "I'm a apple"));
//		================================================================================
		
//		4. 메소드 참조 표현식 ==========================================================
		Fruit anonymouseInstance = new Fruit() {
			public String selfIntroduction(String s1, String s2) {
				Add add = new Add();
				return add.instanceAdd(s1, s2);
			}
		};
		System.out.println(anonymouseInstance.selfIntroduction(" <<익명 클래스>> 첫번째", "두번째"));
		
		Fruit lambdaInstance = (String s1, String s2) -> {
				Add add = new Add();
				return add.instanceAdd(s1, s2);
		};
		System.out.println(lambdaInstance.selfIntroduction(" <<람다>> 첫번째", "두번째"));
		
//		instance method
		Add add = new Add();
		Fruit watermelon = add::instanceAdd;
//		static method
		Fruit melon = Add::staticAdd;
//		constructor
		Runnable constructor = Add::new;
		System.out.println(watermelon.selfIntroduction("나는", "수박"));
		System.out.println(melon.selfIntroduction("나는", "메론"));
		
//		anonymous class instance way
		Fruit anonymouseInstanceTwo = new Fruit() {
			public String selfIntroduction(String s1, String s2) {
				return new Add().instanceAdd(s1, s2);
			}
		};
		System.out.println(anonymouseInstanceTwo.selfIntroduction(" <<익명 클래스2>> 첫번째", "두번째"));
		
//		lambda class instance way
		Fruit lambdaInstanceTwo = (String s1, String s2) ->  new Add().instanceAdd(s1, s2);
		System.out.println(lambdaInstanceTwo.selfIntroduction(" <<람다2>> 첫번째", "두번째"));
		
//		method reference instance way
		Fruit reference = new Add()::instanceAdd;	// 람다식을 메소드 참조
		
//		anonymous class static way
		Fruit anonyStatic = new Fruit() {
			@Override
			public String selfIntroduction(String s1, String s2) {
				return Add.staticAdd(s1, s2);
			}
		};
//		lambda class static way
		Fruit lambdaStatic = (String s1, String s2) -> Add.staticAdd(s1, s2);
		
//		method reference static way
		Fruit referenceStatic = Add::staticAdd;
		
//		================================================================================
	}
}
