class Person{
	String name;
	int age;
	
	Person(){
//		this.name = "미입력";
//		this.age = 1;
		this("미입력",1); 		//생성자 호출용 this
	}
	
	Person(String name){
//		this.name = name;
//		this.age = 1;
		this(name,1);
	}
	
	Person(int age,String name){
		this(name,age);
	}
	
	Person(String name,int age){
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
}

public class ConstructorEx02 {
	public static void main(String[] args) {
		Person person = new Person(27,"Jung Hyeon");
		Person park = new Person("박보검");
		Person choi = new Person();
		
		
		person.showInfo();
		park.showInfo();
		choi.showInfo(); 
	}
}
