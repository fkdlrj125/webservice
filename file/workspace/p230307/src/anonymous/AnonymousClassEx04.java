package anonymous;

interface Box{
	public void boxing();
}

class Banana{
	
	public Banana() {
		System.out.println("[Banana] 바나나 멸종위기");
	}
	
	public void buy(Box box) {
		box.boxing();
	}
}

public class AnonymousClassEx04 {
	public static void main(String[] args) {
//		객체 생성
		Banana banana = new Banana();
		
//		Box를 이용한 익명클래스를 정의해 buy의 인수로 넘겨줌
		banana.buy(new Box() {
			@Override
			public void boxing() {
				System.out.println("바나나를 포장합니다.");
			}
		});
	}
}
