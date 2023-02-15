class Dog{
	String name;
	int age;
	
	Dog(){
		this("미입력",0);
	}
	
	Dog(String name, int age){
		this.name = name;
		this.age = age;
		this.showInfo();
	}
	
	void showInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}

public class ConstructorEx03 {
	public static void main(String[] args) {
		
		Dog happy = new Dog();
		Dog sky = new Dog("하늘",5);
		
	}
}
