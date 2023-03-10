package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx02 {
	public static void main(String[] args) {
		// List 객체 생성
		List<String> list = Arrays.asList("하늘바람", "별자리", "솔바람", "하늘구름");
		Stream<String> stream = list.stream();
		
		stream.forEach(System.out::println);
		
		// 가공(중간연산) : filter
		// - 조건에 맞는 요소만 정제하여 새 스트림 객체 생성
		// - 매개변수 : Predicate -> 매개변수 1 리턴 boolean
		System.out.println("\n<< [Stream] 조건에 맞는 값 출력 1>>");
		// 1. Stream 객체 생성
		Stream<String> streamTwo = list.stream();
		// 2. 중간연산 : filter
		Stream<String> result = streamTwo.filter((String s) -> s.contains("바람"));
		// 3. 최종연산 : forEach
		result.forEach(System.out::println);
		
		// [Stream pipelines] 위 작업을 한 라인으로 변경
		System.out.println("\n<< [Stream] 조건에 맞는 값 출력 2>>");
		list.stream()
			.filter((String s) -> s.contains("하늘"))
			.forEach(System.out::println);
		
		// [문제] 
		System.out.println("\n<< [Stream] 문자열의 길이가 4개 이상인 값 출력>>");
		list.stream()
				.filter((String s) -> s.length() >= 4)
				.forEach(System.out::println);
	}
}
