import java.util.function.Predicate;

public class FunctionalInterfaceEx04 {
	public static void main(String[] args) {
		
		// =================================================
		// Predicate<T> : 매개변수 o(1개), 반환값 o(1개,boolean)
		// 
		// Boolean test(T t)
		// =================================================
		
		Predicate<Integer> positive = (Integer s) -> s >= 0;
		
		System.out.println("1은 양수인가요? " + positive.test(1));
		System.out.println("-1은 양수인가요? " + positive.test(-1));
		
	}
}
