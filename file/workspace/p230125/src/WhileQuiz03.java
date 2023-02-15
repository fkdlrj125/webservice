
public class WhileQuiz03 {
	public static void main(String[] args) {
		int idx=1;
		int result=0;
		
		while (idx<=10) {
			result+=idx++;
		}
		System.out.println("1~10까지 누적합 : "+result);
	}
}
