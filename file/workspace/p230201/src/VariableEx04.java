class Baseball{
	static int count = 10;		 
	
	void increment() {
		count++;
	}
	
	void decrement() {
		count--;
	}
	
	void baseballInfo() {
		System.out.printf("현재 개수 >> %d\n",count);
	}
}

public class VariableEx04 {
	public static void main(String[] args) {
		
		Baseball baseball = new Baseball();
		
		baseball.increment();
		baseball.baseballInfo();
		
		Baseball baseball2 = new Baseball();
		baseball2.increment();
		baseball2.baseballInfo();		// count는 static영역에 하나만 생성
										// baseball과 baseball2 둘 다 count에 접근 가능하기 때문에 서로 공유
	}
}
