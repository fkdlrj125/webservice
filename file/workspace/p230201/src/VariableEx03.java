class Number{
	
	// class가 메모리에 로드되면 static은 바로 메모리 할당됨
	// 해당 프로그램이 종료되면 static 영역 해제
	// static은 객체 생성과 상관없이 사용하고 싶을 때 사용
	static int one; 
	int two;
	
	Number(){
		
	}
	
	public Number(int one, int two) {
		this.one = one;					//static은 참조변수를 통한 접근을 권장하지 않음
		this.two = two;
	}
	
	static void staticShow() {
//		System.out.printf("one : %d, two : %d\n",one ,two);	// static 메소드에서는 static 멤버만 가능
		System.out.printf("one : %d\n",one ); // instance 멤버는 생성시기가 달라서 불가능
	}

	void show() {
		System.out.printf("one : %d, two : %d\n",one ,two);
	}
	
}


public class VariableEx03 {
	public static void main(String[] args) {

//		static field 접근
		Number.one = 100;
		System.out.printf("static field >> %d\n",Number.one);

//		static method 접근
		Number.staticShow();
		
//		instance field 접근
		Number number = new Number();
		System.out.printf("instance field >> %d\n",number.two);
		System.out.printf("참조변수를 통한 static 멤버 접근 >> %d\n",number.one);

//		instance method 접근
		number.show();
		
	}
}
