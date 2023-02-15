class Student{
	String name;
	int age;
	
	Student(){
		
	}
	
	Student(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void showInfo() {
		System.out.println("이름 : "+this.name); 
		System.out.println("나이 : "+this.age+"\n");
	}
}


public class ArrayInstanceEx01 {
	public static void main(String[] args) {
		Student[] smart = new Student[3];			// 객체 배열 : 참조 변수의 배열
		
		//배열 생성과 동시에 초기화
		Student[] smartTwo = new Student[] {new Student("Jung Hyeon",27),
											new Student("Bo Gum",29),
											new Student("Ji Sub",40)};
		
		Student[] smartThree = {new Student("Jung Hyeon",27),
								new Student("Bo Gum",29),
								new Student("Ji Sub",40)};
		
		smart[0] = new Student("Jung Hyeon",27);	// -> 참조 변수 배열에 객체의 주소를 저장
		smart[1] = new Student("Bo Gum",29);		// -> 객체는 따로 생성
		smart[2] = new Student("Ji Sub",40);
		
//		for(int i=0; i<smart.length; i++) {
//			smart[i].showInfo();		
//		}
		
		for(Student st:smartTwo) {						// 배열에 저장된 주소가 가르키는 값의 타입
			st.showInfo();
		}
		
	}
}
