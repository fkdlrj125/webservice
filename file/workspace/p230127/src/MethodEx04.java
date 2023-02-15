
public class MethodEx04 {
	
	//	[형태 4] 매개변수 x, 리턴값 o
	//  기능 : 호출하면 리턴값 리턴
	
	public static String return_str() {
		return "좋은 아침~!";
	}
	
	public static void main(String[] args) {
		// 리턴값 처리 
		// 1. 변수에 저장
		String str=return_str();
		System.out.println(str+"\n");
		// 2. 바로 출력
		System.out.println(return_str());
	}
}
