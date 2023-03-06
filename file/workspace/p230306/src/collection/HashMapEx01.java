package collection;

import java.util.HashMap;

/*
 * 	[HashMap]
 * 	- 순서를 보장하지 않음
 * 	- key 와 value로 이루어짐
 * 	- key를 통해 value를 찾아감
 * 	- key와 value의 타입은 참조형만 가능
 */

public class HashMapEx01 {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

//		요소 개수
		System.out.println("요소 추가 전 개수 >> " + hashMap.size());

//		요소 추가
		hashMap.put("하나", 1);
		hashMap.put("둘", 2);
		hashMap.put("셋", 3);
		hashMap.put("하나", 111); // 키가 중복되면 값을 덮어 씌움
		System.out.println("\n요소 추가 후 개수 >> " + hashMap.size());

//		저장된 요소 전체 출력
		System.out.println("\nhashMap >> " + hashMap);

//		저장된 키들의 집합 출력
		System.out.println("\n키 출력 >> " + hashMap.keySet());

//		저장된 값들의 집합 출력
		System.out.println("\n값 출력 >> " + hashMap.values());

//		특정 키 출력
		System.out.println("\n키가 '둘'인 요소의 값 >> " + hashMap.get("둘"));

//		키를 통해 모든 요소의 값 출력
		System.out.println();
		for (String key : hashMap.keySet()) {
			System.out.printf("key : %s, value : %d\n", key, hashMap.get(key));
		}

//		키를 통해 값 변경
		hashMap.replace("하나", 100);
		System.out.println("\n키가 '하나'인 요소의 값을 100으로 변경 후 >> ");
		System.out.println(hashMap);

//		키를 통해 특정 요소 삭제
		hashMap.remove("하나");
		System.out.println("\n키가 '하나'인 요소 삭제 후 >> ");
		System.out.println(hashMap);

//		
	}
}
