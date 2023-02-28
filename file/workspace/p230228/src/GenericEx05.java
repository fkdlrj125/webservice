// 1. 제네릭 타입은 해당 {}(범위)내에서만 유효
// 1-1. 제네릭 타입 선언 형태 : class, interface, method

// [제네릭 인터페이스]
interface InterfaceName<T> {}

// [제네릭 클래스]
class ClassName<T> {}

// 2. 제네릭 타입은 두 개 이상 가능
class ClassOne<K, V> {
	
}



public class GenericEx05 {
	
//	[제네릭 메소드]
	public static <T> void show(T t) {
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		show(new Integer(5));	//	제네릭은 참조형만 처리 가능
		show(5);				// 	자동 형변환(Boxing)으로 가능 : Wrapper class(integer)로
//		show(int); 				// 	기본형은 처리 불가
	}
}
