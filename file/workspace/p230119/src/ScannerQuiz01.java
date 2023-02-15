import java.util.Scanner;

public class ScannerQuiz01 {

	public static void main(String[] args) {
		//정수를 2개를 입력 받은 후, 덧셈 결과를 출력 
		//출력 문구 : 정수 2개를 입력하세요 : 
		Scanner input = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		
		System.out.print("정수 2개를 입력하세요 : ");
		num1=input.nextInt();
		num2=input.nextInt();
		System.out.println("덧셈 결과 : "+(num1+num2));
		
	}

}
