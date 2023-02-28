/*
 * 	[제네릭 타입 제한]
 */

interface Available {
	void selfIntroduction();
}

class Tree {
	private String sort;
	private int age;

	public Tree() {
	}

	public Tree(String sort, int age) {
		this.sort = sort;
		this.age = age;
	}

	public void info() {
		System.out.printf("[INFO] 종류 : %s, 나이 : %d\n\n", sort, age);
	}
}

class Maple extends Tree implements Available {

	public Maple(String sort, int age) {
		super(sort, age);
	}

	@Override
	public void selfIntroduction() {
		System.out.println("나는 단풍나무입니다");
	}

}

class Pine extends Tree implements Available {

	public Pine(String sort, int age) {
		super(sort, age);
	}

	@Override
	public void selfIntroduction() {
		System.out.println("나는 소나무다");
	}

}

public class GenericEx04 {
	// [제네릭 메소드]
	// 자료형에 안전하지 않은 코드
	// 제네릭 매개변수는 Object method만 호출 가능
	// : 따라서 강제 형변환 -> 자료형에 안전하지 않은 코드
	// : 강제 형변환이 Available로 설정됨에 따라, 실행시 Error 발생 가능성 있음
	// : 제네릭 장점 없어짐
	// : 그래서 자바는 제네릭 매개변수 자료형에 제한을 두는 문법 제공
	// -> 자료형에 안전한 코드
//	public static <T> void callSelfIntroduction(T t) {
//		((Available)t).selfIntroduction();
//	}

	// 자료형에 안전한 코드
	// 제네릭 타입 제한에 사용된 extends -> class와 interface에 구분없이 사용
	// 제네릭에서 extends는 이하의 의미(Available을 포함한 자식 타입만 가능)
	// 제네릭에서 super는 이상의 의미(Available을 포함한 부모 타입만 가능)
	public static <T extends Available> void callSelfIntroduction(T t) {
		t.selfIntroduction();
	}

	public static <T extends Tree> void callInfo(T t) {
		t.info();
	}
	public static void main(String[] args) {
		Maple maple = new Maple("당단풍나무", 25);
		Pine pine = new Pine("금강고로쇠", 35);
		Tree tree = new Tree("나무",100);
		
		callSelfIntroduction(maple);
		callSelfIntroduction(pine);
		
//		callSelfIntroduction("안녕");	형변환을 통해 실행하는 방법은 모든 타입을 다 수용하기 때문에
//										컴파일 에러가 발생하지 않고 실행할 때 에러가 발생
		
//		callSelfIntroduction(tree);		Available을 포함한 자식 타입만 사용 가능해 error
		
		callInfo(maple);
		callInfo(pine);
	}
}
