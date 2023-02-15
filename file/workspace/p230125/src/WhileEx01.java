/*
 * 	[반복문] while문
 * 
 * 	초기값 설정;
 * 
 * 	while(조건식){   >> 조건이 true일 동안 반복 
 * 						-> 처음으로 false가 되는 순간 탈출 
 *  	명령문;
 *  	증감식;	
 * 	}
 * 
 */


public class WhileEx01 {
	public static void main(String[] args) {
		int num = 0;
		
		while(num<10) {
			System.out.println("num >> "+(num+1));
			num++;
		}
	}
}
