import java.util.Scanner;

public class SwitchQuiz03 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력 >>> ");
		int user_value=input.nextInt();
		int com_value=(int)(Math.random()*3+1);
		String draw="당신이 비겼습니다.";
		String win="당신이 이겼습니다.";
		String lose="당신이 졌습니다.";
		
		System.out.println("당신은 "+user_value+"입니다.");
		System.out.println("컴은 "+com_value+"입니다.");				
		
//		switch (user_value) {
//		case 1: {
//			switch(com_value) {
//			case 1:
//				System.out.println(draw);
//				break;
//			case 2:
//				System.out.println(lose);
//				break;
//			case 3:
//				System.out.println(win);
//				break;
//			}
//			break;
//		}
//		case 2: {
//			switch(com_value) {
//			case 1:
//				System.out.println(win);
//				break;
//			case 2:
//				System.out.println(draw);
//				break;
//			case 3:
//				System.out.println(lose);
//				break;
//			}
//			break;
//		}case 3: {
//			switch(com_value) {
//			case 1:
//				System.out.println(lose);
//				break;
//			case 2:
//				System.out.println(win);
//				break;
//			case 3:
//				System.out.println(draw);
//				break;
//			}
//			break;
//		}
//		default:
//			System.out.println("잘못된 입력입니다.");
//		}
		
		switch(user_value-com_value) {
			case 1: case -2:
				System.out.println(win);
				break;
			case 0:
				System.out.println(draw);
				break;
			case 2: case -1:
				System.out.println(lose);
				break;
			default:
				System.out.println("잘못된 입력입니다.");
		}
		
		input.close();
	}
}
