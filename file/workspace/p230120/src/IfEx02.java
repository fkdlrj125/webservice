// -조건 2개-
// if(조건식){
// 조건이 true일 때, 실행되는 영역
// } else{
// 조건이 false일 때, 실행되는 영역
// }

public class IfEx02 {
	
	public static void main(String[] args) {
		
		
		int num = 5;

		if(num>5) {
			System.out.println("true일 때, 실행되는 영역");
			num++;
		} else { 
			System.out.println("false일 때, 실행되는 영역");
			num *= 2;
		}
		
		System.out.println("num  : "+num);
		
	}
}
