package exception;

public class ExceptionEx01 {
	public static void main(String[] args) {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);

			// 직접처리
			try {
				Thread.sleep(1000);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
