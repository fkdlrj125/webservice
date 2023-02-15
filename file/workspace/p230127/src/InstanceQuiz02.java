class Customer{
	int Id;
	String name;

	public void setId(int id) {
		Id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void showInfo() {
		System.out.println("ID : "+Id+", Name : "+name);
	}
}


public class InstanceQuiz02 {
	public static void main(String[] args) {
		
		Customer hong = new Customer();
		hong.setId(1);
		hong.setName("홍길동");
		hong.showInfo();
		
		Customer park = new Customer();
		park.setId(2);
		park.setName("박보검");
		park.showInfo();
		
	}
}
