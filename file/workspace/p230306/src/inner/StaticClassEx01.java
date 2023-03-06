package inner;

class OuterThree{
	static class InnerThree{					// inner 클래스 멤버에 static이 있을 때 사용
		int num = 5;
		
		static int user = 10;

		public InnerThree() {
			System.out.println("[InnerThree class] 생성자 실행됨!!");
		}
		
		public void showNum() {
			System.out.println("[Instance field] num >> "+this.num);
			System.out.println("[Static field] user >> "+this.user);
		}
		
		public static void showUser() {
//			System.out.println("[instance field] num >> "+num);	
			System.out.println("[Static field] user >> "+user);
		}
		
	}
}

public class StaticClassEx01 {
	public static void main(String[] args) {
		OuterThree.InnerThree inner = new OuterThree.InnerThree();
		inner.showNum();
		OuterThree.InnerThree.showUser();
	}
}
