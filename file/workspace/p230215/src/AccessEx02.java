class Super{
	private int numOne; 
	int numTwo;
	
	void showOne() {
		System.out.println("showOne() 실행됨");
	}
	public void showTwo() {
		System.out.println("showTwo() 실행됨");
	}
}

class Sub extends Super{
//	부모의 멤버변수 접근
	public void setNumOne() {
//		super.numOne=1;
	}
	public void setNumTwo() {
		super.numTwo=2;
	}
	void showOne() {
		System.out.println("===============================");
		System.out.println("오버라이딩된 showOne() 실행됨");
		System.out.println("===============================");
	}	
//	void showTwo() {	//부모의 접근권한을 줄일 수 없음 크거나 같아야 가능
	public void showTwo() { 
		System.out.println("===============================");
		System.out.println("오버라이딩된 showTwo() 실행됨");
		System.out.println("===============================");
	}
}

public class AccessEx02 {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.showOne();
		s.showTwo();
	}
}
