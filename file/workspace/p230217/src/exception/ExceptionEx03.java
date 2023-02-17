package exception;

import java.util.Scanner;

class Check extends Exception {

	/*
	 *	 
	 */
	private static final long serialVersionUID = 1L;
	int num;

	public Check(int num) {
		super("[예외 발생] 음수 값을 입력하셨군요!");
		this.num = num;
	}
}

public class ExceptionEx03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요... ");
		int userValue = input.nextInt();
		input.close();
		try {
			if (userValue < 0) {
				throw new Check(userValue);
			}
		} catch (Check c) {
//			System.out.println(c);
			System.out.println(c.getMessage());
		}
		System.out.println("입력된 값 >> " + userValue);
	}
}
