package stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx05 {
	public static void main(String[] args) {
		// [최종연산] min, max, average
		// ====================================================================================
		// : 리턴형 - Optional
		// : 빈 Stream일 경우, OptionalEmpty리턴
		// =================================================================================================================
		int min = IntStream.of(1, 3, 5, 7, 9).min().getAsInt();
		System.out.println("min >> " + min);

		OptionalInt optionalMin = IntStream.of(1, 3, 5, 7, 9).min();
		System.out.println("optionalMin >> " + optionalMin);
		System.out.println("optionalMin의 값 >> " + optionalMin.getAsInt());

		OptionalInt max = IntStream.of().max();
		System.out.println("최댓값 >> " + max);

		OptionalDouble average = IntStream.of().average();
		System.out.println("평균값 >> " + average);

		// [문제] 평균값 출력
//		System.out.println("평균값 >> " + IntStream.of(1, 3, 5, 7, 9)
//				 									.average().getAsDouble());
		IntStream.of(1, 3, 5, 7, 9).average().ifPresent((double value) -> System.out.println("평균값 >> " + value));

		int minValue = IntStream.of(-2, 3, 5).min().orElse(-1);
		System.out.println("최솟값 >> " + minValue);

		int sum = IntStream.of(1, 3, 6).sum();
		System.out.println("sum >> " + sum);
		long count = IntStream.of(1, 3, 5).count();
		System.out.println("count >> " + count);
		
	}
}
