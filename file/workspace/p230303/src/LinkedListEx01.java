import java.util.Iterator;
import java.util.LinkedList;

/*
 * 	[Linked List]
 * 	- 배열을 이용한 리스트가 아니라 다음 노드의 주소를 저장해서 연결해 배열처럼 만든 리스트
 *  
 *  - 단방향 : 단일 연결 리스트
 *  	- 다음 노드의 주소만 저장
 *  - 양방향 : 이중 연결 리스트
 *  	- 다음 노드와 이전 노드의 주소 저장
 */

public class LinkedListEx01 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

//		저장된 요소(노드) 존재 여부
		System.out.println("비어있나요? " + list.isEmpty());

//		요소 추가
		list.add("하나");
		list.add("둘");
		list.add("셋");
		list.add("하나");
		System.out.println("비어있나요? " + list.isEmpty());

//		특정 위치에 저장된 요소 출력
		System.out.println("\n인덱스 1 >> " + list.get(1));

//		요소 개수
		System.out.println("\n저장된 요소 개수 >> " + list.size());

//		객체 존재 여부
		System.out.println("\n요소 '둘' 있나요? >>" + list.contains("둘"));
		System.out.println("\n요소 '넷' 있나요? >>" + list.contains("넷"));

//		저장된 모든 요소 출력
		System.out.println("\n<< 모든 요소 출력 >>");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\n<< Enhanced for loop >>");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("\n<< toArray >>");
		for (Object o : list.toArray()) {
			System.out.println(o);
		}

		System.out.println("\n<< Iterator >>");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("\n<< toString >>");
		System.out.println(list.toString());

//		같은지 비교
		System.out.println();
		for (String s : list) {
			System.out.println("'셋'과 같나요?" + s.equals("셋"));
		}

//		특정 요소 변경 : 둘을 여섯으로 변경
		System.out.println();
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).equals("둘"))
//				list.set(i, "여섯");
//			System.out.println(list.get(i));
//		}
		list.set(list.indexOf("둘"),"여섯");
		for(String s : list) {
			System.out.println(s);
		}
		
//		특정 요소 제거
		System.out.println("\n<< 요소 '셋' 삭제 >>");
		list.remove("셋");
		list.remove("하나");		// 중복되는 요소가 있어도 가장 처음 만나는 요소를 제거
		for(String s : list) {
			System.out.println(s);
		}
	}
}
