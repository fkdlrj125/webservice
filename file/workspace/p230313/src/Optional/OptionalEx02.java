/*
 * 	[Optional]
 * 	- wrapper 클래스(값을 감싸주는 클래스) 중 하나
 * 	- null 처리를 하기 위해 사용
 * 	- 
 */

package Optional;

import java.util.Arrays;
import java.util.List;

public class OptionalEx02 {
	public static String findByName(String name) {
		List<String> result = Arrays.asList("홍길동", "박보검", "이미자");
		for(String s : result) {
			if(s.equals(name))
				return s;
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println("[이름 찾기-1] 이미자 >> "+findByName("이미자"));
		System.out.println("[이름 찾기-2] 하늘 >> "+findByName("하늘"));
		
		System.out.println("[이름 찾기-1] 이미자 길이>> "+findByName("이미자").length());
		// NullPointerException
		String findName = findByName("하늘");
		if(findName != null) {					// 값을 가공할 때 null값인지 전부 확인해줘야 됨
			System.out.println("[이름 찾기-2] 하늘 길이>> "+findByName("하늘").length());	// null 값을 가공할 때 error발생
		}
	}
}
