package phone;

public class PhoneBookInfo {
	String name;
	String phoneNumber;
	
	public PhoneBookInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void showPhoneInfo() {
		System.out.println("이름 : "+this.name);
		System.out.println("번호 : "+this.phoneNumber);
	}
}
