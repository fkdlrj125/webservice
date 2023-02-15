// [삼항 연산자](조건 연산자)

// 변수 = (조건식) ? true일 때 실행할 명령어 : false일 때 실행할 명령어;
//								결과에는 대입 사용 불가

public class OperatorEx04 {
	public static void main(String[] args) {
		
		//num의 값이 5이상이면, 10을 저장
		//num의 값이 5미만이면, 0을 저장
		int num = 3;
		num = (num>=5)?10:0;
		
		System.out.println(num);
	}
}
