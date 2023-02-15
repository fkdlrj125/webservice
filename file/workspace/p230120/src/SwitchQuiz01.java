import java.util.Scanner;

public class SwitchQuiz01 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("현재 월을 입력하세요 : ");
		int user_value=input.nextInt();
		String season="";
		
		switch(user_value) {
		case 12: case 1: case 2:
			season="겨울";
			break;
		case 3: case 4: case 5:
			season="봄";
			break;
		case 6: case 7: case 8:
			season="여름";
			break;
		case 9: case 10: case 11:
			season="가을";
			break;
		}
		
		System.out.println("현재의 계절은 "+season+"입니다.");
		input.close();
	}
}
