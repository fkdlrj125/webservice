class Item{

	int year;
	String name;
	final String company;					// 반드시 생성자로 초기화  

	public Item(int year, String name, String company) {
		this.year = year;
		this.name = name;
		this.company = company;
	}
	
	
//	void setCompany(String company) {		// setter는 객체 생성이 완료되야 실행
//		this.company = company;				// -> final변수를 초기화할 수 없음
//	}

	void showInfo() {
		System.out.printf("year >> %d\nname >> %s\ncompany >> %s\n\n",this.year,this.name,this.company);
	}
	
}




public class VariableEx02 {
	public static void main(String[] args) {
		
		Item item1 = new Item(2022,"T300","Lee");
		item1.showInfo();
		Item item2 = new Item(2022,"T400","Choi");
		item2.showInfo();
//		item.setCompany();
	}
}
