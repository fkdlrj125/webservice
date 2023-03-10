package stream;

import java.util.Arrays;
import java.util.List;

public class StreamQuiz02 {
	public static void main(String[] args) {
		List<String> language = Arrays.asList("Python", "C", "Java", "Java Script");
		
		// [Stream] 문자열 길이 기준으로 오름차순 정렬 후 출력
		language.stream()
				.sorted((String s1, String s2) -> s1.length() - s2.length())
				.forEach(System.out::println);
	}
}
