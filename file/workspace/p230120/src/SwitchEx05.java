// 리터럴(literal)
// 정수형 리터럴 : 5(int)
// 실수형 리터럴 : 2.5(double)
// 문자형 리터럴 : 'a'(char)
// 문자열 리터럴 : "사과"(String)

public class SwitchEx05 {
	
	public static void main(String[] args) {
		
		String fruit = "사과"; //"사과"가 저장된 주소값(타입:int)을 저장함
		
		switch(fruit) {//주소값을 비교하기 때문에 switch 사용가능
		case "사과": //case에 있는 "사과"의 주소값은 상수이기 때문에
					 //fruit에 저장된 "사과"의 주소값을 공유한다 
			System.out.println("사과는 오른쪽 창고에 있습니다.");
			break;
		case "배":
			System.out.println("배는 왼쪽 창고에 있습니다.");
			break;
		default:
			System.out.println("나머지 과일은 위쪽 창고에 있습니다.");
			
		}
	}
}
