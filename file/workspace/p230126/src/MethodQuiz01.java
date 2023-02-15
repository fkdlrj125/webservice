
public class MethodQuiz01 {
	public static void add(int num1,int num2) {
		int result=0;
		int pocket=0;
			
		if(num2<num1) {
			pocket=num1;
			num1=num2;
			num2=pocket;
		}
		for(int i=num1;i<=num2;i++) {
			result+=i;
		}

		System.out.println(num1+"~"+num2+"의 누적합 >> "+result);
	}
	
	public static void main(String[] args) {
		add(2,5);
		add(5,2);
	}
	
}
