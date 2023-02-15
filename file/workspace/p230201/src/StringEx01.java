/*
 * 	[상수] literal
 * 	
 * 	- 정수형 상수 : 5		-> int
 *  - 실수형 상수 : 2.5		-> double
 *  - 문자형 상수 : 'a'		-> char
 *  - 문자열 상수 : "abc"	-> String
 * 
 */


public class StringEx01 {
	public static void main(String[] args) {
		
		String str1 = "안녕";				// String은 char[]을 멤버 변수로 가짐
		String str2 = "안녕";				// 같은 상수를 저장하면 같은 주소를 공유
											// stack영역에 참조변수를 생성 후 리터럴영역에 저장된 
											// "안녕"주소를 바로 저장
		
		String str3 = new String("안녕");	// heap 영역에 String 객체 생성 후 멤버 변수에
											// "안녕"상수의 주소를 저장
		
//		if(str1==str3) {					// str3은 객체의 주소를 저장하기 때문에 false
//			System.out.println("같다");
//		}  else {
//			System.out.println("다르다");
//		}
		
		if(str1.equals(str3)) {				// 문자열을 비교할 땐 equals 이용 
			System.out.println("같다");
		}  else {
			System.out.println("다르다");
		}
		
		// String 객체 배열
//		String[] strArr = new String[3];
//		
//		strArr[0] = new String("Java");
//		strArr[1] = new String("HTML");
//		strArr[2] = new String("Python");
		
		//String 객체 배열 생성과 동시에 초기화
//		String[] strArr = new String[] {new String("Java"),
//										new String("HTML"),
//										new String("Python")};
		String[] strArr = {"Java",
						   "HTML",
						   "Python"};
		
		for(String str:strArr) {
			System.out.println(str);
		}
	}
}
