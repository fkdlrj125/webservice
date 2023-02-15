/*
 * 	[do while문]
 * 
 * 	do{
 * 	명령어
 * 	증감식
 * 	}while(조건식);
 * 
 * 	조건에 상관없이 반복문 처음 한 번은 꼭 실행하고 싶을 때 사용 
 * 		
 * 	
 */


public class DoWhileEx01 {
	public static void main(String[] args) {
		
		int idx=1;
		
		//[while문] -> 조건에 만족해야 실행
		while (idx<1) {
			System.out.println("idx >> "+idx);
			idx++;
		}
		
		//[do while문] -> 먼저 실행하고 조건을 확인
		do {
			System.out.println("idx >> "+idx);
			idx++;
		} while (idx<1);
		
		System.out.println("반복문 실행 후 idx >> "+idx);
	}
}
