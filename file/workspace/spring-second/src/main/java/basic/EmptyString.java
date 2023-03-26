package basic;

public class EmptyString {
	public static void main(String[] args) {
		String one = "";
		String two = null;
		String three = "안녕";
		String four = "          ";
		
		System.out.println("one >> " + one);
		System.out.println("two >> " + two);
		
//		[빈 문자열 확인 1] equals() method 
		System.out.println("one.equals() >> " + one.equals(""));
//		- NullPointerException
//		System.out.println("two.equals() >> " + two.equals(""));
		
//		[빈 문자열 확인 2] length() method : 문자열 길이 0 
		System.out.println("one : 빈 문자열 길이 >> " + one.length());
//		- NullPointerException
//		System.out.println("two : null 길이 >> " + two.length());
		
//		[빈 문자열 확인 3] isEmpty() method
//		: Java 6 이후 - 문자열의 길이 0인 경우 true 리턴
		System.out.println("one.isEmpty() >> " + one.isEmpty());
//		- NullPointerException
//		System.out.println("two.isEmpty() >> " + two.isEmpty());
		System.out.println("three.isEmpty() >> " + three.isEmpty());
		System.out.println("four.isEmpty() >> " + four.isEmpty());
		
		
//		cf) isBlank() method
//		: Java 11 이후 - 문자열이 비었거나 공백만 있을 경우 true 리턴
//		: 공백을 처리하기 위해 만든 메소드
		System.out.println("one.isBlank() >> " + one.isBlank());
//		- NullPointerException
//		System.out.println("two.isBlank() >> " + two.isBlank());
		System.out.println("three.isBlank() >> " + three.isBlank());
		System.out.println("four.isBlank() >> " + four.isBlank());
	}
}
