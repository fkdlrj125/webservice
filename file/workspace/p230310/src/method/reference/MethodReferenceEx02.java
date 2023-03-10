package method.reference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class MethodReferenceEx02 {
	public static void main(String[] args) {
		String[] arr = {"A", "c", "E", "d", "b"};
		
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		// 정렬 : 오름차순 정렬 - 대소문자 구분
		Arrays.sort(arr);
		System.out.println("정렬 후 : "+Arrays.toString(arr));
		
		// 정렬 : 대소문자 구분x
		// 1. 익명 클래스
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareToIgnoreCase(s2);
			}
		});
		System.out.println(Arrays.toString(arr));
		
		// 2. 람다
		Arrays.sort(arr, (String s1, String s2) -> s1.compareToIgnoreCase(s2));
		System.out.println(Arrays.toString(arr));
		
		// 3. 메소드 참조
		Arrays.sort(arr, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(arr));
	}
}
