//	이미 생선된 클래스는 선언 필요X

public class InstanceEx06 {
	public static void newYear(Student student) { // 참조형 매개변수 : 자료형이 class
		System.out.println("이름 : "+student.getName());
		System.out.println("나이 : "+(student.getAge()+1));
	}
	
	public static void main(String[] args) {
		Student lee = new Student();
		
		lee.setAge(25);
		lee.setName("Jung Hyeon");
		lee.showInfo();
		newYear(lee);	// 같은 객체 내 멤버 변수값을 증가시켜 값 증가o
		
	}
}