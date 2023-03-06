package inner;

interface Yahoo {
	public void showNum();
}

class OuterTwo{
	
	public Inner getInner(int num) {
		return new Inner(num);
	}
	
	private class Inner implements Yahoo{					// inner class는 멤버라 private 사용가능
															   
		int num;
		
		public Inner(int num) {
			this.num = num;
			System.out.println("[Inner class] 생성자 실행됨!");
		}
		
		public void showNum() {
			System.out.println("[Inner class] num >> "+this.num);
		}
	}
	
	
}

public class instanceClassEx02 {
	public static void main(String[] args) {
		OuterTwo outer = new OuterTwo();
//		OuterTwo.Inner inner = outer.new Inner(1);
//		inner.showNum();
		
		Yahoo inner = outer.getInner(1);				 	//	inner class가 private이라 접근이 불가능
															//	inner class에 부모를 상속해 다형성으로 접근
		inner.showNum();
	}
}
