package anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnonymousClassEx05 {
	public static void main(String[] args) {

		ArrayList<String> hangul = new ArrayList<String>();
		hangul.add("하늘");
		hangul.add("돌");
		hangul.add("나비");
		hangul.add("바람");
		System.out.println("정렬 전 : " + hangul);

//		========================================================================
//		[오름차순 1] Collections.sort(변수명)
//		========================================================================
		Collections.sort(hangul);
		System.out.println("Collections 정렬 후 : " + hangul);

//		========================================================================
//		[내림차순 1] Collections.sort(변수명, Collections.reverseOrder())
//		========================================================================
		Collections.sort(hangul, Collections.reverseOrder());
		System.out.println("Collections 내림차순 정렬 후 : " + hangul);

//		========================================================================
//		[오름차순 2] List.sort() : Java 8 이후
//		========================================================================
		hangul.sort(Comparator.naturalOrder());
		System.out.println("List 정렬 후 : " + hangul);

//		========================================================================
//		[내림차순 2] List.sort()
//		========================================================================
		hangul.sort(Comparator.reverseOrder());
		System.out.println("List 내림차순 정렬 후 : " + hangul);
		
//		========================================================================
//		[오름차순 3] Comparator 인터페이스 구현
//		========================================================================
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		}; 
		hangul.sort(comparator);
		System.out.println("Comparator 오버라이딩 후 : " + hangul);
		
//		========================================================================
//		[내림차순 3] Comparator 인터페이스 구현
//		========================================================================
		Comparator<String> comparator2 = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		}; 
		hangul.sort(comparator2);
		System.out.println("Comparator 오버라이딩 내림차순 후 : " + hangul);
		
//		<< String class : compareTo() method >> 
//		첫번째 인수 - 두번째 인수
//		==========================================================================================
//		출력 결과 - 양수(첫번째 인수가 크다) 			  | 음수(두번째 인수가 크다) | 0(같다)
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		오름차순    첫번째 인수와 두번째 인수 자리를 바꿈 | 순서를 바꾸지 않음(유지) | 순서 유지
//		내림차순	두번째 인수와 첫번째 인수 자리를 바꿈 | 순서를 바꾸지 않음(유지) | 순서 유지
//		==========================================================================================
		
//		오름차순 정렬
//		- [데이터 순서] CAB
		System.out.println("C와 A 비교 >> " + "C".compareTo("A"));	// 양수라 교체
//		- [데이터 순서] ACB	
		System.out.println("C와 B 비교 >> " + "C".compareTo("B"));	// 양수라 교체
//		- [데이터 순서] ABC
		
//		내림차순 정렬
//		- [데이터 순서] CAB
		System.out.println("A와 C 비교 >> " + "A".compareTo("C"));	// 음수라 교체X
//		- [데이터 순서] CAB	
		System.out.println("B와 A 비교 >> " + "B".compareTo("A"));	// 양수라 교체
//		- [데이터 순서] CBA
	}
}
