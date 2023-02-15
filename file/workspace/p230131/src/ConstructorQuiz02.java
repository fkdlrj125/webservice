class Caculator{
	int value1;
	int value2;
	
	Caculator(){
	}
	
	Caculator(int value1,int value2){
		this.value1=value1;
		this.value2=value2;
	}
	
	void add() {
		System.out.println("덧셈 결과 >> "+(value1+value2));
	}
	
	void sub() {
		System.out.println("뺄셈 결과 >> "+(value1-value2));
	}
	
	void mul() {
		System.out.println("곱셈 결과 >> "+(value1*value2));
	}
	
	void div() {
		if(value2==0) {
			System.out.println("분모가 0으로 계산 불능입니다.");
		}else {
			System.out.println("나눗셈 결과 >> "+(value1/value2));
		}
	}
}


public class ConstructorQuiz02 {
	public static void main(String[] args) {
		
		System.out.println("-- 첫번째 계산 --");
		Caculator firstCaculator = new Caculator(5,2);
		firstCaculator.add();
		firstCaculator.sub();
		firstCaculator.mul();
		firstCaculator.div();
		
		System.out.println("\n-- 두번째 계산 --");
		Caculator secondCaculator = new Caculator(7,0);
		secondCaculator.add();
		secondCaculator.div();
		
	}
}
