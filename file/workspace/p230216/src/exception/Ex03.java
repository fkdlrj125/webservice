package exception;

public class Ex03 {
	public static void main(String[] args) {

		int[] arr = { 2, 4, 6 };

		try {
			arr[3] = 10;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
	/*
	 * } catch (ArrayIndexOutOfBoundsException e) { 
	 * 		// e.printStackTrace();
	 * 		System.out.println(e.getMessage());
	 */
		} catch (Exception e) {
			System.out.println("Error");
		}
		System.out.println("main method 종료!!");
	}
}
