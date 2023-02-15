import java.util.Scanner;

public class WhileQuiz05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int result=0;
		int user_value=0;
		
		while(true) {
			System.out.print("정수를 입력하세요(종료 -1) >> ");
			user_value = input.nextInt();
			if(user_value==-1) {
				System.out.println("총합 >> "+result);
				break;
			}
			result+=user_value;
		}
		input.close();
	}
}
