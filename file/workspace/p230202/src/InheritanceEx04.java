// Java의 모든 class는 Object class를 부모로 둠

class Student{
	
	public String toString() {
		System.out.println("재정의된 메소드 toString 실행됨");
		return "Student Class";
	}
}

public class InheritanceEx04 {
	public static void main(String[] args) {
		Student s = new Student();
		// 참조변수를 그냥 적었을 땐 자동으로 toString 실행
		// s.에서 기본적으로 보여지는 것들은 Object의 멤버
		System.out.println(s);
		
	}
}
