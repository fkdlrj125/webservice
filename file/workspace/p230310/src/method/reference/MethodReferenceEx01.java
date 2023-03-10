package method.reference;

import java.util.function.Function;

@FunctionalInterface
interface Greeting{
	int say(String str);
}

public class MethodReferenceEx01 {
	public static void main(String[] args) {
		Greeting anonymous = new Greeting() {
			@Override
			public int say(String str) {
				return str.length();
			}
		};
		System.out.println("[익명 클래스] 문자열 길이 >> "+anonymous.say("abcdef"));
		
		Greeting lambda = (String str) -> str.length();
		System.out.println("[익명 클래스] 문자열 길이 >> "+lambda.say("abcdef"));
		
		Greeting reference = String::length;	// 기본타입의 참조형은 객체 생성을 하지 않아도 사용가능
		System.out.println("[메소드 참조] 문자열 길이 >> "+reference.say("abcdef"));
		
//		[문제] generic functional interface 사용
//		1. 익명 클래스
		Function<String, Integer> quizAnonymous = new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				return s.length();
			}
		};
		System.out.println("[Function 익명 클래스] 문자열 길이 >> "+quizAnonymous.apply("가나다라"));
		
//		2. 람다
		Function<String, Integer> quizLambda = (String s) -> s.length();
		System.out.println("[Function 람다] 문자열 길이 >> "+quizLambda.apply("가나다라"));
		
//		3. 메소드 참조
		Function<String, Integer> quizReference = String::length;
		System.out.println("[Function 메소드 참조] 문자열 길이 >> "+quizReference.apply("가나다라")); 
		
	}
}
