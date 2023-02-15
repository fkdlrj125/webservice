import java.util.Scanner;

public class ScannerQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1.정수를 1개 입력 받은 후 출력
		 * 2.문자열 1개 입력 받은 후 출력
		 * 3.
		 * */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 1개를 입력해주세요 : ");
		int num=input.nextInt(); //정수 1개를 입력 받음
		System.out.println("입력 받은 정수 : "+num); //입력 받은 정수 출력
		
		System.out.print("문자열을 입력해주세요 : ");
		input.nextLine(); //입력 버퍼를 비워줌
		String str=input.nextLine(); //문자열 1개를 입력 받음
		System.out.println("입력 받은 문자열 : "+str); //입력 받은 문자열 출력
		input.close();
	}

}
