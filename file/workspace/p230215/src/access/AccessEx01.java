package access;

class Test{
	
}

public class AccessEx01 {
	private int num1;
	int num2;
	protected int num3;
	public int num4;
	
//	private,default 변수는 메소드를 통해서만 외부에서 접근가능
//	protected변수는 상속을 통해 접근 or 메소드를 통해서 접근
	public int getNum1() {
		return this.num1;
	}
}
