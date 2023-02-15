
public class IfQuiz01 {
	
	public static void main(String[] args) {
		
		int num1 = 11,num2 = 1;
		
//		if(num1>num2) {
//			System.out.println("큰 값 : "+num1+", 작은 값 : "+num2);
//		} else {
//			System.out.println("큰 값 : "+num2+", 작은 값 : "+num1);
//		}
		
		int max=0,min=0;
		
		if(num1>num2) {
			max=num1;
			min=num2;
		} else if(num1<num2) {
			max=num2;
			min=num1;
		}
		
		System.out.println("큰 값 : "+max+", 작은 값 : "+min);
	}
}
