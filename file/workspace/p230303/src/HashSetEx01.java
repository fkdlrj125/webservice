/*
 * 	[HashSet]
 * 	- 요소를 추가할 때 중복확인을 한 후 있다면 추가x
 * 		1. 해당 요소에서 hashcode() 메소드를 호출하여, 반환된 해쉬값으로 검색할 범위 결정
 * 		2. 해당 범위 내에서 요소들을 equals() 메소드로 비교
 * 	- HashSet에서 add() 메소드를 사용하여 중복 없이 새 요소를 추가하기 위해서는
 * 	  hashcode()와 equals() 메소드를 상황에 맞게 오버라이딩해야 함 
 * 		- 클래스 타입에 사용된 멤버 변수들은 HashSet이 비교하지 못해 직접 오버라이딩해야함
 * 	- Set은 순서를 보장하지 않음 -> 저장공간에 정렬하지 않고 추가
 */

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		// 저장된 요소 존재 여부
		System.out.println("비어있나요? >> "+set.isEmpty());
		
		// 요소 추가
		set.add("하나");
		set.add("둘");
		set.add("셋");
		set.add("하나");
		
		System.out.println("\n비어있나요? >> "+set.isEmpty());
		
		// 요소 개수
		System.out.println("\n저장된 요소 개수 >> "+set.size());
		
		// 특정 위치에 저장된 요소 출력 : index 사용 X
		// System.out.println("인덱스 1에 저장된 요소 >> "+set.get(1));
		
		// 객체 포함(존재) 여부
		System.out.println("\n'둘' 있나요? "+set.contains("둘"));
		System.out.println("'넷' 있나요? "+set.contains("넷"));
		
		// 저장된 요소 전체 출력
		System.out.println("\n<< 향상된 for문 >>");
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("\n<< toArray() >>");
		for(Object o : set.toArray()) {
			System.out.println(o);
		}
		System.out.println("\n<< Iterator() >>");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
		
		// 요소 추가
		System.out.println("\n요소 추가 : 일곱 >> "+set.add("일곱"));
		System.out.println("요소 추가 후 길이 >> "+set.size());
		 
		System.out.println("\n요소 추가 : 하나 >> "+set.add("하나"));
		System.out.println("요소 추가 후 길이 >> "+set.size());
		
		System.out.println("\n<< 해쉬코드 >>");
		System.out.println("'하나'의 해쉬코드 >> "+"하나".hashCode());		// 해쉬코드 값이 같으면 둘은 같은 요소 
		System.out.println("'둘'의 해쉬코드 >> "+"둘".hashCode());			
		for(String s : set) {
			System.out.print(s+" >> ");
			System.out.println(s.hashCode());
		}
		
		System.out.println("\nset의 해쉬코드 >> "+set.hashCode()); 			// 모든 객체엔 해쉬코드가 존재
	}
}
