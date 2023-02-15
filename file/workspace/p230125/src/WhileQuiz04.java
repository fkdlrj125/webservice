import java.util.Scanner;

public class WhileQuiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 1개를 입력 >>> ");
		int user_value=input.nextInt();
		int count=1;
		int random=0;

		while(true) {
			random=(int)(Math.random()*10+1);
			System.out.print(random+" ");
			if(random==user_value) {
				System.out.println("\n"+count+"회 실행해서 찾았다!");
				break;
			}
			count++;
		}
		input.close();
	}
}
