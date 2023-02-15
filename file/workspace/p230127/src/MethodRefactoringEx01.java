import java.util.Scanner;

/*
 * 	[메소드 리팩토링] 
 * 	- 결과엔 변화 없이 코드를 재구성하는 것
 * 	- 가독성과 효율을 올리기 위해
 * 	
 */


public class MethodRefactoringEx01 {
	
	public static void increment(int value) {
		value++;
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		int num = 5;
		increment(num);

		Scanner input = new Scanner(System.in);
		int userNum = input.nextInt();
		increment(userNum);
		
		int var = 10;
		increment(var);
		
		input.close();
	}
}
