/*
 * 	[final] -> 금지
 * 
 * 	final field  : 값 변경 금지
 * 	final method : 오버라이딩(기능변경) 금지 -> 상속에서만 사용
 * 	final class  : 상속 금지
 */

class Fruit{
	int count;
	
	Fruit(){}
	
	Fruit(int count){
		this.count=count;
	}
	
	public void showCount() {
		System.out.println("현재 남은 개수는 "+this.count + "입니다.");
	}
	
	public void showInfo() {
		System.out.println("과일 정보를 출력하는 메소드입니다.");
	}

	public int getCount() {
		return count;
	}
} 

class Banana extends Fruit{
	Banana(){
	}
	
	Banana(int count){
		super(count);
	}
//	Banana(int count){
//		super.count=count;
//	}
	
	public void showInfo() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("현재 과일은 바나나입니다.");
		System.out.println("바나나는 "+super.getCount()/*super.count*/+"개 있습니다.\n");
	}
}

public class FinalEx01 {
	public static void main(String[] args) {
		Banana bananaOne = new Banana();
		bananaOne.showInfo();
		
		Banana bananaTwo = new Banana(10);
		bananaTwo.showInfo();
	}
}
