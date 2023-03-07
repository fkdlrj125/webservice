package anonymous;

interface Space{
	void youKnow();
}

class SubSpace implements Space{
	@Override
	public void youKnow() {
		System.out.println("우주에 대해 아는 것이 있나요?");
	}
}

public class AnonymousClassEx03 {
	public static void main(String[] args) {
		
//		1. 다형성
		Space spaceOne = new SubSpace();
		spaceOne.youKnow();
		
//		2. 익명 클래스 - 인터페이스 구현
		Space spaceTwo = new Space() {
			@Override
			public void youKnow() {
				System.out.println("우리가 있는 태양계는 우리 은하에 속해 있습니다.");
			}
		};
		spaceTwo.youKnow();
	}
}
