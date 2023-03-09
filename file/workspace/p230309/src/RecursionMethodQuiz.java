
public class RecursionMethodQuiz {

//	public static int factorial(int num) {
//		int factorial = 1;
//		for(int i = 1; i <= num; i++) {
//			factorial = factorial * i;
//		}
//		return factorial;
//	}
	
	// 재귀 메소드
	static int storage = 1;
	public static int factorial(int num) {
		if(num == 0)
			return storage;
		storage *= num;
		return factorial(--num);
	}
	
	public static void main(String[] args) {
		System.out.println("5! = " + factorial(5));
	}
}
