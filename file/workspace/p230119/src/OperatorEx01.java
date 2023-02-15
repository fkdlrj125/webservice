
public class OperatorEx01 {
	public static void main(String[] args) {
		//[연산자]
		//대입 연산자 =
		//오른쪽 값을 왼쪽 변수에 저장한다
		int num = 5;
		
		//산술 연산자 + - * / % 
		int n1=5,n2=3;
		System.out.println("덧셈 : "+(n1+n2));
		System.out.println("뺄셈 : "+(n1-n2));
		System.out.println("곱셈 : "+(n1*n2));
		System.out.println("나눗셈 : "+(n1/n2));
		System.out.println("나머지 : "+(n1%n2)); //->짝수, 홀수, ~배수를 찾을 때
		
		//복합 대입 연산자 += -= *= /= %=
		int n3=2;
		System.out.println("+= : "+(n3+=2));
		System.out.println("-= : "+(n3-=2));
		System.out.println("*= : "+(n3*=2));
		System.out.println("/= : "+(n3/=2));
		System.out.println("%= : "+(n3%=2));
		
		
	}
}
