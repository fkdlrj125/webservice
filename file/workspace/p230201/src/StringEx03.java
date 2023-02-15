class Student{
	//
}


public class StringEx03 {
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s);				// 참조변수를 그냥 출력하면 자동으로 toString()이 실행
		System.out.println(s.toString());	// toString()은 객체 안에 저장된 값을 리턴
		System.out.println(s.getClass());
		System.out.println(s.getClass().getName());
		
		String str = "안녕";
		System.out.println(str);
		System.out.println(str.toString());
		
		Integer num = 5;
		System.out.println(num);
		System.out.println(num.toString());
		
	}
}
