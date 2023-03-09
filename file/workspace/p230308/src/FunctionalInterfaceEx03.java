import java.util.function.Function;

public class FunctionalInterfaceEx03 {
	public static void main(String[] args) {
		
		// =================================================
		// Function<T, R> : 매개변수 o(1개), 반환값 o(1개)
		// Function<매개변수, 반환값>
		// 
		// R apply(T t)
		// =================================================
				
		// 1. 정수 1개를 받아서 문자열 리턴
		// 1-1. [익명 클래스] anonymous inner class
		Function<Integer, String> anonymous = new Function<Integer, String>() {
			@Override
			public String apply(Integer t) {
				return "[익명 클래스] 매개변수 값은 "+ t +"입니다.";
			}
		};
		System.out.println(anonymous.apply(10));
		
		// 1-2. [람다] lambda expression
		Function<Integer, String> lambda = (Integer t) -> "[lambda] 매개변수 값은 " + t + "입니다.";
		System.out.println(lambda.apply(100));
		
		// [문제] 문자열을 1개를 입력 받아서 문자열의 길이를 출력
		Function<String, String> stringLength = (String s) -> s+"의 길이 >> "+s.length();
		System.out.println(stringLength.apply("좋은 오후"));
		
		// 2. 정수 1개를 받아서 정수 리턴
		// [문제] 정수 1개를 받은 후, 제곱한 값을 리턴
		Function<Integer, Integer> power = (Integer t) -> (int)(Math.pow(t,2));
		System.out.println(power.apply(5));
		
		// [문제] 정수 1개를 받은 후, 1증가한 값을 리턴
		Function<Integer, Integer> increment = (Integer t) -> t+1;
		System.out.println(increment.apply(5));
		
		// 순차 실행
		
		// 순행
		System.out.println("<< 7를 1증가 후 제곱 >>");
		System.out.println(power);
		System.out.println(power.compose(increment));
		
		// 역행
		System.out.println("<< 7를 제곱한 후 1 증가 >>");
		System.out.println(power.andThen(increment).apply(7));
		
		//
		System.out.println(Function.identity().apply("즐거운 인생!"));
	}
}
