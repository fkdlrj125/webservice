package enumex;

enum Number {
	ONE(1), TWO(2), THREE(3), FOUR(4);
	int num;
	
	private Number() {
	}
	private Number(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}

public class EnumEx04 {
	public static void main(String[] args) {
		Number currentNumber = Number.ONE;

		switch (currentNumber) {
		case ONE:
			System.out.println(currentNumber);
			break;

		case TWO:
			System.out.println(currentNumber);
			break;

		case THREE:
			System.out.println(currentNumber);
			break;

		case FOUR:
			System.out.println(currentNumber);
			break;

		}
		
		// 서수 출력(설정된 정수 값 출력)
		System.out.println("<<서수 출력>>");
		
		for(Number n:Number.values()) {
			System.out.println(n.ordinal());
		}
		
		// getter 실행하여, 멤버 변수에 설정된 값 출력
		for(Number n:Number.values()) {
			System.out.println(n.getNum());
		}
	}
}
