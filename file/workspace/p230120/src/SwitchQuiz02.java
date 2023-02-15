import java.util.Scanner;

public class SwitchQuiz02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("정수 2개를 입력하세요 : ");
		int user_value1=input.nextInt(), user_value2=input.nextInt();
		System.out.print("사칙연산(+, -, *, /)중 하나를 입력하세요 : ");
		String user_operator=input.next();
		String cal=user_value1+user_operator+user_value2+"=";
		
		switch(user_operator) {
		case "+":
			System.out.println(cal+(user_value1+user_value2));
			break;
		case "-":
			System.out.println(cal+(user_value1-user_value2));
			break;
		case "*":
			System.out.println(cal+(user_value1*user_value2));
			break;
		case "/":
			System.out.println(cal+(user_value1/user_value2));
			break;
		default:
			System.out.println("잘못된 연산자를 입력하셨습니다!!");
		}
		
		input.close();
	}
}
