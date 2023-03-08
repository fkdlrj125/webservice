import java.util.function.Supplier;

public class FunctionalInterfaceEx01 {
	public static void main(String[] args) {
		
		// =====================================
		// Supplier : 매개변수 x, 반환값 o
		// =====================================
		
		Supplier<String> supplier = new Supplier<String>() {
			@Override
			public String get() {
				return "[익명 클래스 Supplier] get() 실행됨";
			}
		};
		System.out.println(supplier.get());
		
		// 람다
		Supplier<String> lambdaSupplier = () -> "[lambda Supplier] get() 실행됨";
		System.out.println(lambdaSupplier.get());
		
		
	}
}
