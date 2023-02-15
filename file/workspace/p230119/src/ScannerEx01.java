import java.util.Scanner;

public class ScannerEx01 {
	
	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner input = new Scanner(System.in);//Scanner객체 생성
		System.out.print("정수를 입력해주세요 : ");		
		num=input.nextInt();//int형 입력값을 받음		
		System.out.println("num : "+num);
	}
}
