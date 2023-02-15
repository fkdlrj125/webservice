
class Dog{
	String name;
	int age;
	
	void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	

}

public class InstanceEx03 {
	public static void main(String[] args) {
		Dog happy = new Dog();
		Dog sky = new Dog();
		
		happy.setName("해피");
		sky.setName("하늘");
		
		
		System.out.println("첫 번째 객체 : "+happy.getName());
		System.out.println("두 번째 객체 : "+sky.getName());
	}
}
