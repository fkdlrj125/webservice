package inter;

interface Method {
	void one(); // 메소드는 public abstract로 고정

	public abstract void two();
	
	// Java 8 부터 일반 메소드 지원
    // << default method >>
	default void method() {
		System.out.println("[Interface] default method");
	}
	
	// << static method >>
	public static void staticMethod() {
		System.out.println("[interface] static method");
	}
}

class Sub implements Method {

	@Override
	public void one() {
		System.out.println("[Sub class] 오버라이딩된 메소드 one()");
	}

	@Override
	public void two() {
		System.out.println("[Sub class] 오버라이딩된 메소드 two()");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Method m = new Sub();
		m.one();
		m.two();
		m.method();
		Method.staticMethod();
	}
}
