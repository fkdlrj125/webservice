class Fruit{
	int count;
	
	Fruit(){}				// count는 객체의 멤버변수이기 때문에 자동으로 0으로 초기화
	
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

public class InheritanceEx06 {
	public static void main(String[] args) {
		Banana bananaOne = new Banana();
		bananaOne.showInfo();
		
		Banana bananaTwo = new Banana(10);
		bananaTwo.showInfo();
	}
}
