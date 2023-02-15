/*
 * 	[변수의 종류]
 * 	--------------------------------------------------------------
 * 						| 메모리 영역	| 메모리 할당 시기
 * 	--------------------------------------------------------------
 * 	지역변수			| stack			| 해당 영역이 실행
 * 	멤버변수(instance)	| heap			| 객체 생성될 때
 * 	지역변수(static)	| static(class)	| class가 로드(load)될 때
 *  --------------------------------------------------------------
 *  
 *  [static]
 *  - static(class) field(변수)/method(메소드) | class영역 내에 static 영역이 존재
 *  
 *  클래스명으로 관리 -> 클래스명.static변수명/static메소드()
 *  
 *  class가 메모리에 로드(load)될 때, static(class) 영역에 할당
 *  
 *  instance(객체) 생성과 상관없이 접근(사용) 가능 
 *  -> 객체 생성과 상관없이 변수/메소드를 사용하고 싶을 때 사용 
 *  
 *  해당 클래스로 생성된 객체들이 공유하는 변수
 *  
 *  static(class) 메소드 내에서는 static 멤버만 접근(사용) 가능
 *  -> 생성 시기가 다름
 *  -> static 멤버 메모리 할당 후, instance 멤버 메모리 할당
 *  
 *  [final]	 
 *  - final이 붙은 것을 상수화 => 상수
 *  - final이 붙은 것은 변경 금지
 *  - 초기화한 값으로 값 고정
 *  - 변수, 메소드, 클래스에 사용 가능
 *	  
 */

class Product{
	int year;
	String name;
	final String company;
	
	Product(int year, String name,String company) {
		this.year=year;
		this.name=name;
		this.company=company;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public void setCompany(String company) {	
//		this.company = company;
//	}

	void showInfo() {
		System.out.printf("year >> %d\nname >> %s\ncompany >> %s\n\n",this.year,this.name,this.company);
	}
}

public class VariableEx01 {
	public static void main(String[] args) {

		// 지역 변수
		int num1;
		num1 = 5;
		num1 = 7;
		
		// final 변수
//		final int num2 = 0;	// final은 이름을 대문자로 해주는 것이 알아보기 쉬움
		final int NUM2 = 0;	
		
//		num2=1;				// final 변수라 값 변경 불가
	
		// 객체 생성
		Product product1 = new Product(2023, "T300", "Lee");
		product1.showInfo();
		
		System.out.println("\n<< 생산년도 변경 >>");
		product1.setYear(2022);
		product1.showInfo();
		
		System.out.println("\n<< 제조회사 변경 >>");
		//product1.setCompany("Choi");	
		product1.showInfo();
		
		
		
	}
}
