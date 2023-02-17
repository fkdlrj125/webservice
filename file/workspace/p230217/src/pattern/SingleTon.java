package pattern;

// [디자인 패턴]
//  - 객체지향 언어의 장점들을 모아 가장 효율적으로 개발할 수 있게 만들어 놓은 틀
//	- 객체를 유일하게 하나만 생성(전역 개념)

class Pattern{
	private static Pattern member_field = new Pattern();
	
//	외부에서 객체 생성 불가능!
	private Pattern() {}
	
	public static Pattern getPattern() {
		System.out.println("[패턴 클래스 내]"+member_field);
		return member_field;
	}
	
	@Override
	public String toString() {
		return "Pattern 클래스입니다.";
	}
	
	// 멤버변수(field) i에 설정된 값을 외부에서 사용하려면?
	private int i = 100;
	public int getI() {
		return i;
	}
	
}

public class SingleTon {
	public static void main(String[] args) {
//		Pattern p = new Pattern();
		Pattern p = Pattern.getPattern();
		System.out.println(p);
		System.out.println(p.getI());
	}
}
