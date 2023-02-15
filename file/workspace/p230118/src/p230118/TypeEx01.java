package p230118;

public class TypeEx01 {
	public static void main(String[] args) {
		byte one=127;
		System.out.println("one : "+one);
		
//	숫자 값을 대입할 때 대입하는 값도 메모리에 할당된다 그때 설정되는 자료형은 int형이다
//	long자료형에 값을 대입할 때 대입되는 값의 자료형이 int이기 때문에 따로 설정하지 않으면 
//	int범위까지만 저장된다.
//	ex)long num=10000000000->에러
//  long num=10000000000L(접미사 대입되는 값을 long으로 변경->
//	정수형은 int보다 큰게 long밖에 없어서 long만 있음) ->에러x

		long two=10000000000L;
		System.out.println("two : "+two);
		
		char three= 5;
		System.out.println("three : "+three);
	}
}
