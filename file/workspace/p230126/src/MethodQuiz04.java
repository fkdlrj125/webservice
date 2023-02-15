
public class MethodQuiz04 {
	public static void main(String[] args) {
		
		System.out.println("5! = "+factorial(5));
	}
	
	public static int factorial(int value) {
		
		int result=1;
		
		for(int i = 2;i<=value;i++) {
			result*=i;
		}
		return result;
	}
}
