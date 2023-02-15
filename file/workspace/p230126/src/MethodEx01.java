/*
 * 	[method]
 * 	-기능, 동작
 *  -메소드를 만드는 것을 "메소드를 정의한다"라고 함
 *  -메소드는 정의 한 후,"호출"해야 실행됨
 *  -메소드는 여러 번 호출 가능함
 */


public class MethodEx01 {
	
//	반환형 메소드명(매개변수, 매개변수){            -> 선언부
//		명령어;
//		명령어;										-> 메소드 정의
//		
//		return 값;
//		
//	}
	
//	[형태] 매개변수 o,리턴값 x
	public static void increment(int num) {
		System.out.println("1증가한 값 >> " + (++num));
	}

	public static void/* 리턴형 */ main/* 메소드명 */(String[] args)/* 변수 선언->매개변수 */ { 
		/* 메소드 바디 */
		
		//메소드 호출 : 메소드명();
		System.out.println("<<main method 시작>>");
		int num = 100;
		increment(5);
		System.out.println("num : "+num);
		System.out.println("<<main method 종료>>");
	}
}
