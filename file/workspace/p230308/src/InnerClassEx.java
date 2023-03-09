
class Outer{
	private int one = 1;
	private int two = 2;
	
	class Inner {
		private int one = 100;
		private int two = 200;
		
		public void showMember() {
			System.out.println("one >> " + one);
			System.out.println("two >> " + two);
			System.out.println("Outer one >> " + Outer.this.one);
			System.out.println("Outer two >> " + Outer.this.two);
		}
	}
}

public class InnerClassEx {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner inner = out.new Inner();
		
		inner.showMember();
	}
}
