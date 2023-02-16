package exception;

import java.util.Scanner;

public class Ex02 {

	public static void inputData() throws ArithmeticException {
		System.out.println("inputData Method ------ 시작");
		Scanner input = new Scanner(System.in);

		System.out.print("정수 2개 입력 : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int result1 = 0;
		int result2 = 0;
		
		result1 = n1 / n2;
		result2 = n1 % n2;
		
//		try {
//		}catch (Exception e) {
//			System.out.println("계산 불능"); 
//		} finally {
//			System.out.println("예외처리 구문 실행 종료!!!");
//		}
		System.out.println("몫 : " + result1);
		System.out.println("나머지 : " + result2);
		System.out.println("inputData Method ------ 종료");
	}

	public static void main(String[] args) {
		System.out.println("[Main Method] >>>> START");
		try {
			inputData();
		}catch(Exception e){
			System.out.println("[Main Method] 예외처리 - 분모가 0으로 계산 불능");
		}
		System.out.println("[Main Method] >>>> END");
	}
}
