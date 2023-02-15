public class OperatorEx03 {
	public static void main(String[] args) {
		//증가 감소 연산자 ++ -- (메모리를 참조해 바로 증가)
		int num1 = 1;
		System.out.println("++ : "+(++num1)); //연산자가 앞에 붙으면 선적용
		System.out.println("++ : "+(num1++)); //연산자가 뒤에 붙으면 후적용
		System.out.println("-- : "+(--num1)); 
		System.out.println("-- : "+(num1--));
		System.out.println("num1 : "+num1);
		
	}
}
