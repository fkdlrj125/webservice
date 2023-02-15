/*
 * 	[지역 변수]
 * 	영역 내 선언된 변수 -> 선언된 영역 내에서만 접근(사용) 가능
 * 	
 *  
 */


public class WhileEx04 {
	public static void main(String[] args) {
		
		int idx=1;	//main method 영역 내에서 선언된 변수
		
		while(idx<10) {
			int num=100;	//while 영역 내에서 선언된 변수
			System.out.println("while문 내 선언된 변수 num >> "+num);
			
			idx++;
		}
		
		System.out.println("idx >> "+idx);
		//System.out.println("num >> "+num); //while 영역 밖이라 접근 불가능
		
	}
}
