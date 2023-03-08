package lambda;

@FunctionalInterface
interface Box {
	public String boxing();
}

class Banana {
	public Banana() {
		System.out.println("\n[Banana constructor] 나는 '바나나'다.");
	}

	public void buy(Box box) {
		System.out.println(box.boxing());
	}
	
	// [익명 클래스]
//	public Box change() {
//		return new Box() {
//			@Override
//			public String boxing() {
//				return "새 바나나 박스로 교환합니다.";
//			}
//		};
//	}
	
	// [람다]
	public Box change() {
		return () -> "[람다] 새 바나나 박스로 교환합니다.";
	}
}

public class LambdaEx02 {
	public static void main(String[] args) {

		// 익명 클래스
		// 1. 객체 생성
		Banana bananaOne = new Banana();

		
		// 2-1. 익명 클래스를 참조변수에 저장
		Box box = new Box() {
			@Override
			public String boxing() {
				return "[익명 클래스] 박스1";
			}
		};
		
		bananaOne.buy(box);
		bananaOne.buy(bananaOne.change());
		
		// 2-2. 익명 클래스를 인수에 사용
		bananaOne.buy(new Box() {
			@Override
			public String boxing() {
				return "[익명 클래스] 박스2";
			}
		});

		// 3. lambda를 인수에 사용
		Banana lambda = new Banana();
		Box lambdaBox = () -> "[람다] 박스3";
		lambda.buy(lambdaBox);
		bananaOne.buy(() -> "[람다] 박스4");
	}
}
