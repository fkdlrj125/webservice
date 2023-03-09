package method.reference;

import java.io.PrintStream;
import java.util.function.Consumer;

public class MethodReferenceEx02 {
	public static void main(String[] args) {
		
		// 출력 메소드 : System.out.println() ==========================================
		// : 매개변수 1개 - String, 리턴값 x
		// : Consumer에 참조 가능
		// =============================================================================
		
		// [익명 클래스]
		Consumer<String> anonymous = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		anonymous.accept("[익명 클래스] 오늘도 즐거운 하루");
		
		// [람다]
		Consumer<String> lambda = (String t) -> System.out.println(t);
		lambda.accept("[람다] 졸려");
		
		// [메소드 참조]
		Consumer<String> reference = System.out::println;
		reference.accept("[메소드 참조] 신기하다");
	}
}
