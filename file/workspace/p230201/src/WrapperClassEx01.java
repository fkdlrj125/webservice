/*
 * 	[Wrapper Class] ==========================
 * 	
 * 	Byte - Short - Character - Integer - Long
 * 	Float - Double
 * 	Boolean
 * ===========================================
 * 
 * 	[자동 형변환]
 * 
 * 				 boxing			
 * 	  기본 자료형 -----> 참조형
 *  primitive type	  reference type
 * 				 <-----
 * 				unboxing
 * 
 * 	Wrapper class를 호출할 땐 자동으로 값을 가져옴
 * 
 */


public class WrapperClassEx01 {
	public static void main(String[] args) {
		int num1 = 5;
		Integer num2 = 5;					// 자동으로 int 5를 new Integer(5)로 바꿔줌
//		Integer num3 = new Integer(5);		// 사장된 표현법
		Integer num3 = Integer.valueOf(5);
		int num4 = num3;					// num3객체에 들어있는 값 5를 자동으로 int 5로 가져옴
											
		System.out.println(num3 );
	}
}
