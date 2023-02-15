
public class TypeEx03 {
	public static void main(String[] args) {
		//[실수형]
		//float, double(기본자료형)
		//  4      8
		//소수 자릿수까지 정확히 표현해야 처리 가능
		//float->소수 7번째까지 정확히 표현가능(유효자릿수)
		//double->소수 16번째까지 정확히 표현가능

		double one=2.34;
		System.out.println("one : "+one);
		
		float two=2.34F;
		System.out.println("two : "+two);

		//double을 float에 저장할 수 없음->정확도(유효자릿수의 차이)의 차이때문에
		//실수접미사:f
		
		//[논리형]
		//boolean:true(1),false(0)
		//   1
		boolean value=true;
		System.out.println("value : "+value);
		
		//[참조형]
		
		String str="즐거운 하루";
		System.out.println("str : "+str);
		
	}
}
