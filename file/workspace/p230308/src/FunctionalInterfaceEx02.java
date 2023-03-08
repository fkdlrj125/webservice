import java.util.Arrays;
import java.util.function.Consumer;

public class FunctionalInterfaceEx02 {
	public static void main(String[] args) {
		
		// =====================================
		// Consumer : 매개변수 o(1개), 반환값 x
		// =====================================
		
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		consumer.accept("[익명 클래스 Consumer] accept() 실행됨");
		
		Consumer<String> lambdaConsumer = (String t) -> System.out.println(t);
		lambdaConsumer.accept("[lambda Consumer] accept() 실행됨");
		
		// ================================================
		// 문자열.split() : 특정 문자를 기준으로 나누기
		// ================================================
		
		// 공백 기준으로 문자열 나누기
		System.out.println("문자열 나누기 작업 중".split(" "));
		System.out.println("문자열 나누기 작업 중".split(" ")[0]);
		
		// String 1차원 배열 참조변수에 저장
		//		[문자열, 나누기, 작업, 중]
		String[] str = "문자열 나누기 작업 중".split(" ");
		System.out.println(Arrays.toString(str));
		
		//		[문자열, 나누기 작업 중]
		String[] str2 = "문자열 나누기 작업 중".split(" ",2);
		System.out.println(Arrays.toString(str2));
		
		//		[문자열, 나누기, 작업 중]
		String[] str3 = "문자열 나누기 작업 중".split(" ",3);
		System.out.println(Arrays.toString(str3));
		
		//		[문자열, 나누기, 작업, 중]
		String[] str4 = "문자열 나누기 작업 중".split(" ",10);
		System.out.println(Arrays.toString(str4));
		
		//		[문자열 , 기 작업 중]
		String[] str5 = "문자열 나누기 작업 중".split("나누");
		System.out.println(Arrays.toString(str5));
		
		//		[문자열 나누기 작업 중]
		String[] str6 = "문자열 나누기 작업 중".split("만약");
		System.out.println(Arrays.toString(str6));
		
		// [문제] 문자열을 입력 받은 후, 공백 기준 두 번째 문자열 출력
		// ex) input : 오늘도 즐거운 하루 -> output : 즐거운 
		Consumer<String> consumerSplit = (String t) -> System.out.println(t.split(" ")[1]);
		consumerSplit.accept("오늘도 즐거운 하루");
	}
}
