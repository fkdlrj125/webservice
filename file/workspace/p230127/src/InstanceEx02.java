//	- 멤버 변수 값에 직접 접근하는 것(외부 접근)은 보안에 좋지 않음
//	  (참조 변수를 통해 멤버 변수 값 설정)
// 	- 간접적으로 접근해(setter) 값을 넣는 것(내부 접근)이 안전함

class Person{
	int age;
	String name;
	String address;
	
	/*
	 * void setPerson(int input_age, String input_name){ age=input_age;
	 * name=input_name; }
	 */
	
	//	setter : 멤버 변수의 값을 설정하는 메소드
	
	void setAge(int age) {
		this.age=age;		//this : 참조변수 -> 자기 자신의 주소를 저장
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	void setAddress(String address) {
		this.address=address;
	}
	
	//	getter
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
	String getAddress() {
		return address;
	}
	
	
	
	void personInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("주소 : "+address);
	}
}


public class InstanceEx02 {
	public static void main(String[] args) {
		
		//객체 생성
		Person p1 = new Person();
		
		//멤버 접근
		p1.setAge(27); //변수 값 설정
		p1.setName("Jung Hyeon");
		p1.personInfo(); //변수 값 출력
	}
}
