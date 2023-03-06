/*
 * 	[Collection]
 * 	- Data(필드) + Algorithm(메소드)
 * 	- 데이터를 묶어서 관리 및 사용을 쉽게하기 위한 구조
 * 	- 사용하는 목적은 배열과 같지만, 제공하는 기능(메소드)이 배열보다 다양
 * 		
 * 
 * 	[Collection Framework]
 * 	- 컬렉션 클래스와 인터페이스의 집합
 *  - 프로그래밍 편리성, 통합된 API 구조로 인한 효율성 증대
 *  
 *  =========================================================================================================
 *  								 	순서		| 	중복허용	|			  구현 클래스	
 *  ========================================================================================================
 *  collection<E>		<- List<E>		 O			|		O		|ArrayList, LinkedList, Stack, Queue ...
 *  					<- Set<E>		 X			|		X		|HashSet, TreeSet, ...
 *  												|				|
 *  Map<K, V>							 X			|	 key : X	|HashMap, TreeMap, ...
 *  												|  value : O	|
 *  =========================================================================================================
 */
package colllection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionFramworkEx01 {
	public static void main(String[] args) {
//		ArrayList 객체 생성 : 리스트 생성
		ArrayList<String> arrayList = new ArrayList<String>();

//		저장된 요소 존재 여부
		System.out.println("비어있나요? " + arrayList.isEmpty());

//		요소 개수
		System.out.println("[요소 추가 전] 저장된 요소 개수 >> " + arrayList.size());

//		요소 추가
		arrayList.add("하나");
		arrayList.add("둘");
		arrayList.add("삼");
		arrayList.add("넷");

		System.out.println("[요소 추가 후] 저장된 요소 개수 >> " + arrayList.size());

//		특정 위치에 저장된 요소 접근
		System.out.println("인덱스 0 접근 >> " + arrayList.get(0));
		System.out.println("인덱스 0 접근 >> " + arrayList.get(2));

//		객체 포함 여부 확인
		System.out.println("둘 있나요? >> " + arrayList.contains("둘"));
		System.out.println("둘 있나요? >> " + arrayList.contains("여섯"));

//		저장된 요소 전부 출력 - 일반 for문
		System.out.println("\n<< 요소 전체 출력 1 >>");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.printf("인덱스 %d >> %s \n", i, arrayList.get(i));
		}

//		저장된 요소 전부 출력 - 향상된 for문
		System.out.println("\n<< 요소 전체 출력 2 >>");
		for (String s : arrayList) {
			System.out.println(s);
		}

//		저장된 요소 전부 출력 - toArray()
		System.out.println("\n<< 요소 전체 출력 3 >>");
		for (Object o : arrayList.toArray()) {
			System.out.println(o);
		}

//		저장된 요소 전부 출력 - iterator()
		System.out.println("\n<< 요소 전체 출력 4 >>");
		Iterator<String> iter = arrayList.iterator(); // 일회용 -> iterator() 메소드 내에서 객체를 생성해서 사용

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

//		특정 객체가 요소와 같은지 비교
		System.out.println();
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("[셋]과 같나요? " + arrayList.get(i).equals("삼"));
		}

//		특정 요소 변경
		System.out.println("\n셋 -> 여섯 변경");
		arrayList.set(2, "여섯");
		for (String s : arrayList) {
			System.out.println(s);
		}

//		특정 요소 삭제
		System.out.println("\n << 요소 '둘' 삭제 >>");
		Boolean result = arrayList.remove("둘");
		System.out.println("요소 '둘' 삭제 결과 >> "+result);		// 끝이 아닌 요소가 삭제되면 뒤에 있는 요소들이 앞으로 옴
																	// 요소가 늘어나면 요소들이 이동할 때 대량으로 이동해 효율이 떨어질 수 있다
		for (String s : arrayList) {
			System.out.println(s);
		}
		System.out.println("요소 개수 >> "+arrayList.size());
		
//		요소 추가
		arrayList.add("하나");						// 끝에 추가
		System.out.println();
		for (String s : arrayList) {
			System.out.println(s);
		}
		
//		인덱스 1에 '다섯' 추가
		arrayList.add(1, "다섯");
		System.out.println();		
		for (String s : arrayList) {
			System.out.println(s);
		}
//		모든 요소 삭제
		arrayList.clear();
		
		System.out.println("\n모든 요소 삭제 후 요소 개수 >> " + arrayList.size());
	}
}
