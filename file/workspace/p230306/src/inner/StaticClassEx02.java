package inner;

class OuterFour{
	public void instanceMethod() {
		InnerStatic in = new InnerStatic();
		InnerInstance ins = new InnerInstance();
	}
	
	public static void staticMethod() {
		InnerStatic in = new InnerStatic();
//		InnerInstance ins = new InnerInstance();	
	}
	
	class InnerInstance{
	}
	
	static class InnerStatic {
	}
}

public class StaticClassEx02 {
	public static void main(String[] args) {
		
	}
}
