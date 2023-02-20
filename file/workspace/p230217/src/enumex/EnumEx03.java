package enumex;

enum SeasonTwo{
//	enum은 반드시 첫 라인에 객체생성이 와야함
//	변수의 타입X(타입은 자기자신), 키워드 접근제어자X(public static final로 고정), 값 변경X(객체 생성으로 고정)
//	따로 초기화 해주지 않으면 자동으로 변수명으로 초기화
	SPRING(), SUMMER(), FALL(), WINTER();	
	String name;
	
//	접근 제어자 사용불가(private으로 고정)
//	public SeasonTwo(){
//		
//	}
	
	
}

public class EnumEx03 {
	public static void main(String[] args) {
//		enum의 객체 생성 불가능(생성자가 private)
//		SeasonTwo s = new SeasonTwo();
		System.out.println(SeasonTwo.SPRING);
		System.out.println(SeasonTwo.SUMMER);
		System.out.println(SeasonTwo.FALL);
		System.out.println(SeasonTwo.WINTER);
		
//		열거형 상수를 배열 형태로 리턴
		System.out.println(SeasonTwo.values());
//		열거형 상수의 값 확인:ordinal()
//		ordinal(): 서수 - 순서
		for(SeasonTwo s:SeasonTwo.values()) {
			System.out.println(s.ordinal());
		}
//		열거형 변수
		SeasonTwo spring = SeasonTwo.SPRING;
		System.out.println(spring);
		SeasonTwo spring_two = SeasonTwo.SPRING;
		if(spring==spring_two)
			System.out.println("같다");
		else
			System.out.println("다르다");
		
//		열거형 상수명 리턴(field에 저장된 값) : name()
		System.out.println("상수명 리턴 >>> "+SeasonTwo.SPRING.name());
	}
}
