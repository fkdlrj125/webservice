package generic;

/*
 * 	[제네릭 배열]
 * 	- 제네릭 타입은 컴파일을 할 때 정해져야 되는데 
 * 	  배열은 사용될 때 힙 영역에 생성되서 배열 생성 불가 / 자료형으로는 사용가능
 */

class Cool<T> {
	T count;
	T[] array;					// 자료형으로는 사용 가능
//	T[] array = new T[10];		// 배열 생성 불가
	
	public Cool() {}
	
	public Cool(T count) {
		this.count = count;
	}
}


public class GenericEx09 {
	public static void main(String[] args) {
		Cool<String> cool = new Cool<String>();
//		Cool<Object> coolTwo = new Cool<String>();	// 타입 파라미터는 상속관계 인식 불가
	}
}
