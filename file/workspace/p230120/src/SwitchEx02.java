
public class SwitchEx02 {
	
	public static void main(String[] args) {
		
		float fo = 2.34f;
		int num = 2;
		int one = 1;
		int two = 2;
		
		switch(fo) { // switch는 정수만 올 수 있다.
		case one: //case는 고정된 값만 올 수 있다.
			System.out.println("정수값");
		case two:
		default:
			System.out.println("나머지 모두");
		};
	}
}
