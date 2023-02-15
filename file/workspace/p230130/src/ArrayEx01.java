/*
 * 	[배열] Array
 * 	자료형[] 배열명 = new 자료형[길이]; 길이=갯수
 * 	자료형[] 배열명 = new 자료형[]{초기값1,초기값2,...};
 * 	자료형[] 배열명 = {초기값1,초기값2,...};
 * 
 * 	- 하나의 이름으로 여러 값(요소, 원소, 객체)을 관리
 * 	- 여러 값이 메모리에 연속해서 할당
 * 	- 여러 값을 구분하기 위해 인덱스 사용
 * 	  -> 인덱스(index)는 0부터 시작
 * 	- 자바는 무조건 배열을 객체로 생성 -> heap 영역 생성
 * 	- 배열 생성과 동시에 초기화할 경우, 반드시 길이는 생략
 * 	- 배열을 생성하면, 배열의 길이가 length 변수에 저장
 * 	  ->배열명.length
 * 	  ->length는 변경 불가능 (ex) 배열명.length = 5; 불가
 */


public class ArrayEx01 {
	public static void main(String[] args) {
//		int math01 = 80;
//		int math02 = 95;
//		int math03 = 90;
//		int math04 = 70;
//		int math05 = 100;
		
		// 배열 생성
		int[] math;
		
		math = new int[5];		
		
		math[0] = 80;
		math[1] = 95;
		math[2] = 90;
		math[3] = 70;
		math[4] = 100;
		
//		System.out.println("math[0] >> "+math[0]);
//		System.out.println("math[1] >> "+math[1]);
//		System.out.println("math[2] >> "+math[2]);
//		System.out.println("math[3] >> "+math[3]);
//		System.out.println("math[4] >> "+math[4]);
		
		System.out.println("배열의 길이 >> "+math.length);
		
		for(int i=0;i<math.length;i++) {
			System.out.println("math["+i+"] >> "+math[i]);
		}
		
		// 향상된 for문(배열에서만 사용)
//		for(int el:math) {
//			System.out.println(el);
//		}
		
		
	}
}
