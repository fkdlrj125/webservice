import java.util.function.Function;

public class FunctionEx01 {
	public static void main(String[] args) {
		Function<String, String> f = new Function<String, String>() {
			@Override
			public String apply(String t) {
				System.out.println(this);
				return null;
			}
			@Override
			public <V> Function<V, String> compose(Function<? super V, ? extends String> before) {
				System.out.println(this);
				return Function.super.compose(before);
			}
		};
		Function<String, String> f2 = new Function<String, String>() {
			@Override
			public String apply(String t) {
				System.out.println(this);
				return null;
			}
		};
		f.apply(null);
		f2.apply(null);
		f.compose(f2);
		
	}
}
