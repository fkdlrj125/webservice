package exception;

public class ExceptionEx02 {
//											전가
	public static void main(String[] args)  throws InterruptedException{
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
