/*
 *	[Stream] ===========================================================================
 *	- 연속적인 작업 가능
 *
 *	<< 스트림 생성 >>
 *	- 배열, 컬렉션 데이터로만 생성가능
 *	
 *	<< 단계 >> 
 *		생성 		 -> 가공(결과값이 스트림) -> 결과(결과값이 스트림이 아닌 타입)
 *	Stream 객체 생성 -> 	 중간연산 		  -> 최종연산
 *	
 * 	<< 특징 >>
 * 	- 원본 데이터를 변경하지 않음 : 복사본
 * 	- 일회용 
 * 	- 내부 반복으로 작업 처리
 *	==================================================================================== 	
 */

package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamEx01 {
	public static void main(String[] args) {
		
		// [작업] 1차원 배열을 오름차순 정렬 후 출력
		// [방법 1] ===================================================
		// 1차원 배열 생성
		String[] arr = {"하나", "둘", "셋", "넷"};
		
		// 정렬 : 오름차순 -> 원본 변경
		Arrays.sort(arr);
		for(String s : arr)
			System.out.println(s);
		
		// [방법 2] ===================================================
		// 스트림 생성
		String[] arrTwo =  {"하나", "둘", "셋", "넷"};
		System.out.println("\n"+Arrays.toString(arrTwo));
		Stream<String> stream = Arrays.stream(arrTwo);
		System.out.println("\n<< stream.sorted().forEach() >>");
//		stream.sorted() -> 중간연산(return stream) .forEach() -> 최종연산(return void)
		stream.sorted().forEach(System.out::println);;
		
//		Stream<String> s = stream.sorted(); // Error -> 위에서 이미 최종연산이 끝났기 때문에 참조변수 stream 사용불가
		
//		원본 arrTwo 배열 출력
		System.out.println("\n원본 배열 arrTwo 출력");
		for(String s : arrTwo){
			System.out.println(s);
		}
		
//		새 Stream 객체 생성
		stream = Arrays.stream(arrTwo);
		
//		내림차순 정렬 후 출력
		System.out.println("\n<< stream.sorted().forEach() >>");
//		stream.sorted((String s1, String s2)->s2.compareTo(s1)).forEach(System.out::println);	
		stream.sorted(Collections.reverseOrder())
				.forEach(System.out::println);	
	}
}
