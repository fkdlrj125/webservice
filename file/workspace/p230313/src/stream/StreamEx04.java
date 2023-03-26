package stream;

import java.util.stream.IntStream;

public class StreamEx04 {
	public static void main(String[] args) {
		// [중간연산] mapTo ==========================================================================================
		// 형변환, 타입 변경
		// mapToInt(), mapToLong(), mapToDouble()
		// mapToObject()
		System.out.println("[mapTo] 형변환");
		double avg = IntStream.range(1,11)						// 시작값부터 끝값전까지 
							  .peek(System.out::println)		
							  .mapToDouble((int value) -> value)
							  .average()						// return OptionalDouble 
							  .getAsDouble();					// OptionalDouble -> Double
		System.out.println("1 ~ 11 의 평균값 >> "+avg);
		
	}
}
