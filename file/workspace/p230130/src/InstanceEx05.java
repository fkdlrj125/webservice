class Robot{
	int productYear;
	String productName;
	
	public int getProductYear() {
		return productYear;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductYear(int productYear) {
		this.productYear = productYear;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	void showInfo() {
		System.out.println("제품명 : "+productName);
		System.out.println("생산년도 : "+productYear);
	}
}

public class InstanceEx05 {
	public static void main(String[] args) {
		
		Robot r1 = new Robot();
		r1.setProductName("Emmet");
		r1.setProductYear(2017);
		r1.showInfo();
		
		Robot r2 = new Robot();
		r2.setProductName("Coil");
		r2.setProductYear(2018);
		r2.showInfo();
		
	}
}
