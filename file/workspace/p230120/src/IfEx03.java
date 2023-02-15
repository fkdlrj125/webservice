// -조건 3개 이상-
// if(조건식1){
// 조건1이 true일 때, 실행되는 영역
// } else if(조건식2){
// 조건1이 false고 조건2가 true일 때, 실행되는 영역
// } else{
// 모든 조건이 false일 때, 실행되는 영역
// }

public class IfEx03 {
	
	public static void main(String[] args) {
		
		int num = 20000;

		if(num > 5) {
			System.out.println("num이 5보다 크다.");
		} else if(num < 5) { 
			System.out.println("num이 5보다 작다.");
		} else {
			System.out.println("num이 5와 같다.");
		}
		
		System.out.println("num  : "+num);
		
	}
}
