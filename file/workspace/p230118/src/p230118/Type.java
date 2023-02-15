package p230118;

public class Type {
	public static void main(String[] args) {

        //[java의 자료형(type,데이터의 종류)]
		//값의 범위->-2^n(비트)-1~(2^n-1)-1(0은 양의 수로 포함하기 때문에 -1)

		//char는 문자이기 때문에 음의 수가 필요 없어 2^16-1

		//byte(1byte),char(2byte),short(2byte),int(4byte),long(8byte):정수

		//float(4byte),double(8byte):실수

		//boolean(1byte):논리

		//String:문자->' '

		//String[]:문자열->" "
		byte num=127;
		System.out.println("num : "+num);
		
		//[변수]
		//메모리 공간에 부여한 이름->이름을 통해 메모리에 쉽게 접근하기 위해

		//변수선언->자료형 변수명;
		//	  ex)byte num;
		//초기화->변수에 처음으로 값을 넣는 것(쓰레기 값을 지우기 위해)
		
		short num2=20000;
		System.out.println("two : "+num2);
		
		num2=1;
		System.out.println("changed two : "+num2);
		
		
	}

}
