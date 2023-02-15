class Fruit{
	int count;
	
	public void showCount() {
		System.out.println("현재 남은 개수는 "+this.count + "입니다.");
	}
	
	public void showInfo() {
		System.out.println("과일 정보를 출력하는 메소드입니다.");
	}
} 

class Banana extends Fruit{
	Banana(){
	}
	
	Banana(int count){
		super.count=count;
	}
	
	public void showInfo() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("현재 과일은 바나나입니다.");
		System.out.println("바나나는 "+super.count+"개 있습니다.\n");
	}
}


public class InheritanceQuiz01 {
	public static void main(String[] args) {
		Banana bananaOne = new Banana();
		bananaOne.showInfo();
		
		Banana bananaTwo = new Banana(10);
		bananaTwo.showInfo();
	}
}
