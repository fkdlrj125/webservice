import java.util.Scanner;

public class IfEx04 {
	
	public static void main(String[] args) {
		
		//사용자가 입력한 정수를 짝수인지 홀수인지 판별
		
		Scanner input=new Scanner(System.in); 
		//입력을 받기 위해 Scanner객체 생성
		
		System.out.print("정수를 1개 입력해주세요 : ");
		int user_value=input.nextInt();
		//정수 1개를 입력받음
		
		//[if문]
		/*
		 * if(user_value%2 == 0) { //2로 나머지 계산을 해 짝수/홀수 판별
		 * System.out.println(user_value+"는(은) 짝수입니다."); 
		 * }else {
		 * System.out.println(user_value+"는(은) 홀수입니다."); 
		 * }
		 */
		
		//[삼항연산자]
		String result=(user_value%2==0)?"짝수":"홀수";
		System.out.println(user_value+"는(은) "+result+"입니다.");
		
		input.close();
	}
}
