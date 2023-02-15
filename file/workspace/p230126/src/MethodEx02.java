
public class MethodEx02 {
	
	//	[형태 2] 매개변수 o,리턴값 o
	//	기능 : 인수 2개를 받은 후, 덧셈한 결과 리턴
	
	//	[return 의미]
	//	- 메소드 실행 끝
	//	- 값을 호출한 메소드로 반환
	
	public static int sum(int num1,int num2) {
		int result=num1+num2;
		
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("method result >> "+sum(5,3));
		
	}
}
