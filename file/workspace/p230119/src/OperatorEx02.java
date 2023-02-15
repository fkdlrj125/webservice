public class OperatorEx02 {
	public static void main(String[] args) {
		//관계 연산자 < > <= >= != == 
		//관계 연산자의 결과값은 true,false
		int num1 =5, num2=3;
		System.out.println("< : "+(num1<num2));
		System.out.println("> : "+(num1>num2));
		System.out.println("<= : "+(num1<=5));
		System.out.println(">= : "+(num1>=4));
		System.out.println("!= : "+(num1!=num2));
		System.out.println("== : "+(num1==num2));

		//논리 연산자 &&(교집합,and연산자) ||(합집합,or연산자) !(여집합,not연산자,부정연산자)
		boolean bool1=true;
		boolean bool2=false;
		System.out.println("&& : "+(bool1&&bool2));
		System.out.println("|| : "+(bool1||bool2));
		System.out.println("! : "+(!bool1));
		
	}
}
