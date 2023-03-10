import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {						// main메소드 실행
		Scanner input = new Scanner(System.in);						// scanner객체 생성 후 참조변수 input에 주소 저장
		int comValue=(int)(Math.random()*10)+1;						// Math.random으로 생성된 0~1사이의 실수에 
																	// 10을 곱한 후 1을 더하고 int로 형변환해 int형 변수 comValue에 저장  
		int userValue,count=0;										// int형 변수 userValue와 count생성 후 count를 0으로 초기화
		
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");	// 문자열 출력
		
		do {														// do while 반복문 실행
			System.out.print("숫자 입력 : ");						// 문자열 출력
			userValue=input.nextInt();								// 정수 1개를 입력받은 후 userValue에 저장
			
			if(userValue>comValue) {								// userValue가 comValue 초과하면 실행
				System.out.println("컴퓨터 숫자가 더 작습니다.\n");
			} else if(userValue<comValue) {							// userValue가 comValue 미만이면 실행
				System.out.println("컴퓨터 숫자가 더 큽니다.\n");
			}
			count++;												// count에 1증가연산자를 이용해 1증가
		}while(userValue != comValue);								// do while문 조건검사/userValue가 comValue와 같지 않으면 반복문 다시 실행
		
		System.out.println(count+"번만에 정답입니다.");				// 문자열 출력
		
		input.close();												// 리소스 해제
	}
}
