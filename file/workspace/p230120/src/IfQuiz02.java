import java.util.Scanner;

public class IfQuiz02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("성별 1, 2 또는 3, 4를 입력하세요 : ");
		int user_input = input.nextInt();
		
//		if(user_input==1) {
//			System.out.println("남자입니다");
//		} else if(user_input==2) {
//			System.out.println("여자입니다");
//		} else {
//			System.out.println("잘못된 값을 입력하셨습니다.");
//		}
		
		if(user_input==1 || user_input==3) {
			System.out.println("남자입니다.");
		} else if(user_input==2 || user_input==4) {
			System.out.println("여자입니다.");
		} else {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
		
		input.close();
	}
}
