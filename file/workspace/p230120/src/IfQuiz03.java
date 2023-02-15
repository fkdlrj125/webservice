import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("정수 2개 입력 : ");
		
		int num1=input.nextInt(),num2=input.nextInt();
		
//		if(num1>num2) {
//			System.out.println("큰 값 : "+num1+", 작은 값 : "+num2);
//		} else {
//			System.out.println("큰 값 : "+num2+", 작은 값 : "+num1);
//		}
		
		int max,min;
		
		if(num1>num2) {
			max=num1;
			min=num2;
		} else{
			max=num2;
			min=num1;
		}
		
		System.out.println("큰 값 : "+max+", 작은 값 : "+min);
		
		input.close();
	}
}
