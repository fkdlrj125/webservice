package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StreamEx03 {
	public static void main(String[] args) {
		
		// List 객체 생성
		List<String> list = Arrays.asList("하늘 바람", "별 자리", "솔 바람", "하늘 구름");
		
		// [중간연산] filter ========================================================================================
		// Stream에서 조건에 맞는 요소만 정제하여 새 Stream 생성
		// Predicate : 매개변수 1개, 리턴 boolean
		System.out.println("\n[filter] 바람이 포함된 요소만 추출");
		list.stream()
			.filter((String s) -> s.contains("바람"))
			.forEach(System.out::println);
		
		// [중간연산] map ============================================================================================
		// Stream 요소들을 변환하여 새 Stream 생성
		// 저장된 값을 특정한 형태로 변환하는데 주로 사용 (ex: 소문자 -> 대문자)
		// Function : 매개변수 1개, 리턴 있음
		System.out.println("\n[map] 공백 제거");
		System.out.println("\n[map] 공백 제거");
		list.stream()
			.map((String s) -> s.replace(" ", ""))
			.forEach(System.out::println);
		
		// [중간연산] sorted 1) 오름차순 ==============================================================================
		System.out.println("\n[sorted] 오름차순 정렬");
		list.stream()
			.sorted()
			.forEach(System.out::println);
		
		// [중간연산] sorted 2) 내림차순 ==============================================================================
		System.out.println("\n[sorted] 내림차순 정렬");
		list.stream()
			.sorted(Collections.reverseOrder())
			.forEach(System.out::println);
		
		// [중간연산] peek ============================================================================================
		// Stream 요소에 영향을 주지 않고 특정 작업 수행
		// Consumer : 매개변수 1개, 리턴 X
		System.out.println("\n[peek] 중간 출력");
		int sum = IntStream.of(1, 2, 3, 4, 5)
							.peek(System.out::println)
							.sum();
		System.out.println(sum);
		
		// [문제] =====================================================================================================
		System.out.println("\n[peek] 중간 출력");
		int sumEven = IntStream.of(10, 15, 20, 25, 30)
							.filter((int value) -> value%2==0)
							.peek(System.out::println)
							.sum();
		System.out.println("짝수 요소들의 합 >> "+sumEven);
		
		// [중간연산] distinct ============================================================================================
		// 중복된 Stream 요소 제거
		System.out.println("\n[distinct] 중복된 요소 제거");
		IntStream.of(1,3,5,3,5,7,9)
				.distinct()
				.forEach(System.out::println);
		// ============================================================================================================
		
	}
}
