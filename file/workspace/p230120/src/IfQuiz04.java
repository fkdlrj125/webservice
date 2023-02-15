import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("성적을 입력해주세요 : ");
		int user_input = input.nextInt();
		char grade=' ';
		
		if (user_input >= 90 /* && 100>=user_input */) { 
			grade='A';
		} else if (user_input >= 80 /* && 89>=user_input */) {
			grade='B';
		} else if (user_input >= 70/* && 79>=user_input */) {
			grade='C';
		} else {
			grade='D';
		}
		System.out.println("당신의 학점은 " + grade + " 입니다.");
		
		input.close();
		
	}
}
