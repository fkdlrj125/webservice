import java.util.Scanner;

public class Quiz01 {							
	public static void main(String[] args) {	// main 메소드 실행
		Scanner input = new Scanner(System.in);	// 스캐너 객체 생성 후 input 참조변수에 주소 대입(heap 영역)
		int userValue;							// int형 변수 userValue 생성 (stack 영역)
		int result = 1;							// int형 변수 result생성 후 정수 1 대입 (stack 영역			
			
		do {									// do while문 실행
			System.out.print("1~10 사이의 정수 입력 : ");	// 문자열 출력
			userValue = input.nextInt();					// 참조변수 input에 저장된 주소로 스캐너의 멤버메소드
															// nextInt() 실행 후 결과값을 userValue에 대입
		}while(userValue>10 || userValue<1);				// 조건 검사 - userValue가 10초과 or userValue가 1미만일 때
															// 			   반복문 실행
			
		for(int i = 1; i<=userValue; i++) {					// 조건 검사 - int형 변수 i생성 후 1대입;
															// i가 userValue 이하일 때 반복문 실행;
															// i 1증가 후 i에 대입
			result *= i;									// result*i 실행 후 result에 대입
		}
		
		System.out.println(userValue+"! : "+result);		// 문자열 출력
		
		input.close();										// 리소스 해제
	}
}
