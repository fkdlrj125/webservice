class Student{
	private String name;
	private int age;
	
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
	
	public void study() {
		System.out.println("공부해요~");
	}
	
	public void showInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	
}


public class InstanceEx04 {
	public static void main(String[] args) {
		Student lee = new Student();
		lee.setAge(27);
		lee.setName("Jung Hyeon");
		
		lee.showInfo();
		lee.study();
	}
}
