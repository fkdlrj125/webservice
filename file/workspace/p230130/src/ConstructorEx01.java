/*	[생성자] constructor
 * 	- 객체 생성시, 무조건 하나의 생성자 호출
 * 	- 생성자는 '메소드'이다 -> 메소드 오버로딩가능
 * 							-> 생성자 여러 개 정의 가능
 * 	- 생성자명은 클래스명으로 고정
 * 	- 생성자는 반환값(리턴)이 없음 -> 반환형(리턴형) X
 * 	- 생성자를 명시하지 않으면, default 생성자(기본 생성자) 실행
 * 	  -> default 생성자는 매개변수 X, 기능 X 
 * 	
 * 	
 * 	- 객체를 생성할 때, 멤버변수를 원하는 값으로 초기화 가능
 * 	- 객체를 생성할 때, 원하는 기능(특정 메소드)을 실행 가능
 *	
 *	- 생성자가 없다면 기본 생성자를 컴파일러가 자동으로 추가(무조건)
 *	
 * 	[객체 생성 순서]
 * 	1. 메모리 할당(heap 영역)
 * 	2. 생성자 호출
 * 
 */
/*class Person{
	String name;
	int age;
	
	Person(){
		this.name = "미입력";
		this.age = 1;
	}
	
	Person(String name){
		this.name = name;
		this.age = 1;
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person(int age, String name){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	void showInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		
	}
}*/

public class ConstructorEx01 {
	public static void main(String[] args) {
		Person person = new Person(27,"Jung Hyeon");
		Person park = new Person("박보검");
		Person choi = new Person();
		
		
		person.showInfo();
		park.showInfo();
		choi.showInfo();
	}
}
