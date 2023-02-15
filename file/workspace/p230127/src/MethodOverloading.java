/*
 * 	[메소드 오버로딩] (method overloading)
 * 	- 같은 이름의 메소드를 여러 개 정의
 * 	- 단, 매개변수의 정보가 달라야 된다
 * 			(갯수, 타입)
 * 	- 반환형(리턴형)과는 상관x
 */


public class MethodOverloading {
	
	//	[method 정의]
	//	기능 : 정수 2개를 받아서, 덧셈 결과 출력
	//
	
	public static void sum(int num1, int num2) {
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}
	
	public static void sum(double num1, double num2) {
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}
	
	public static void main(String[] args) {
		sum(2,5);
		sum(1.2,3.5);
	}
}
