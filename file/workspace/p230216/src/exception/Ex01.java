package exception;

import java.util.Scanner;

/*
 * 	[예외]
 * 	- try ~ catch ~ finally : 직접 처리
 * 	- try{
 * 		예외 발생 가능한 코드
 * 	  } catch(예외클래스명 참조변수) {
 * 		예외 발생시 처리할 코드
 * 	  } finally{
 * 		예외 발생 여부와 상관 없이, 
 * 		try구문에 마지막에 무조건 실행되는 영역
 * 	  }
 *  - throws : 전가 
 */
public class Ex01 {

	public static void inputData() {
		System.out.println("inputData Method ------ 시작");
		Scanner input = new Scanner(System.in);

		System.out.print("정수 2개 입력 : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int result1 = 0;
		int result2 = 0;

//		[예외처리 구문]
		try {
			result1 = n1 / n2;
			result2 = n1 % n2;
			System.out.println("몫 : "+result1);
			System.out.println("나머지 : "+result2);
		}catch (Exception e) {
			System.out.println("계산 불능"); 
		} finally {
			System.out.println("예외처리 구문 실행 종료!!!");
		}
		
		System.out.println("inputData Method ------ 종료");
	}

	public static void main(String[] args) {
		System.out.println("[Main Method] >>>> START");
		inputData();
		System.out.println("[Main Method] >>>> END");
	}
}
