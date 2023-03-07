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
				return "박스1";
			}
		};
		
		bananaOne.buy(box);
		
		
		// 2-2. 익명 클래스를 인수에 사용
		bananaOne.buy(new Box() {
			@Override
			public String boxing() {
				return "박스2";
			}
		});

		// 3. lambda를 인수에 사용
		Banana lambda = new Banana();
		Box lambdaBox = () -> "박스3";
		lambda.buy(lambdaBox);
		bananaOne.buy(() -> "박스4");
	}
}
