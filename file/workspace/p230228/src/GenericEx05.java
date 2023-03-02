/*
 *  1. 제네릭 타입은 해당 {}(범위)내에서만 유효
 *   - 제네릭 타입 선언 형태
 *   1.1 인터페이스
 *   - interface InterfaceName<T> {}
 *   1.2 클래스
 *   - class ClassName<T> {}
 *   1.3 메소드
 *   - public static <T> void show(T t) {}
 */
// [제네릭 인터페이스]
interface InterfaceName<T> {}

// [제네릭 클래스]
class ClassName<T> {}

// 2. 제네릭 타입(타입 파라미터)은 두 개 이상 가능
class ClassOne<K, V> {}

class ClassSuper{}

class ClassSub extends ClassSuper{}

public class GenericEx05 {
	
//	[제네릭 메소드]
	public static <T> void show(T t) {
		System.out.println(t);
	}
	
//	[extends 와 super] 
//	[타입을 결정하는 것에 중점]
//	타입 파라미터를 제한 -------------------------------------------------------------
	public <T extends ClassSuper> void one(T t) {}
//	public <T super ClassSub> void two(T t) {}			// 문법 불가능! -> ClassSub의 최종부모는 Object이기 때문에 
														//                 super 사용이 의미가 없어짐
	
//	제네릭 인터페이스 또는 제네릭 클래스를 파라미터로 사용
//	? : 와일드 카드(Unbounded wildcard) - 타입이 정해지지 않은 것 - 제네릭 인터페이스나 제네릭 클래스를 사용할 때 사용
//	[기능(동작) 중점] - 멤버를 사용하기 위한 것에 중점
	public void three(ClassName<?> name) {}
//	제네릭 타입(타입 파라미터)을 타입 제한 ---------------------------------------------
	public void four(ClassName<? extends ClassSuper> name) {}
	public void five(ClassName<? super ClassSub> name) {}		// 멤버를 이용하는 것이 중점이기 때문에 사용 가능
	public <T extends ClassName<?>> void six(T t) {}				
	
	
	public static void main(String[] args) {
		show(new Integer(5));	//	제네릭은 참조형만 처리 가능
		show(5);				// 	자동 형변환(Boxing)으로 가능 : Wrapper class(integer)로
//		show(int); 				// 	기본형은 처리 불가
	}
}
