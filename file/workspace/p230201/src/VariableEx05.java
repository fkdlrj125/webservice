class Animal{
	final static int COUNT = 5;
	String name;
}


public class VariableEx05 {
	public static void main(String[] args) {
		System.out.printf("동물 몇 마리 >> %d\n",Animal.COUNT);
//		Animal.count = 10;
		System.out.printf("현재 동물 몇 마리 >> %d\n",Animal.COUNT);
	}
}
