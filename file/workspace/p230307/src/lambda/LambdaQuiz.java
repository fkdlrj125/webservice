package lambda;

@FunctionalInterface
interface MaxReturn {
	int max(int n1, int n2);

	default void method(int n1, int n2) {
		System.out.printf("매개변수 값 n1 : %d, 매개변수 값 n2 : %d\n", n1, n2);
	}
}

public class LambdaQuiz {
	public static void main(String[] args) {

		// [문제 1] 익명 클래스 : 참조에 저장
		MaxReturn max = new MaxReturn() {
			@Override
			public int max(int n1, int n2) {
//				if ((n1 - n2) > 0) {
//					return n1;
//				} else if ((n1 - n2) < 0) {
//					return n2;
//				}
//				return -1;
				return n1 > n2 ? n1 : n2;
			}
		};
		System.out.println(max.max(5, 6));

		// [문제 2] 익명 클래스 : 인수 - System.out.println()
		System.out.println(new MaxReturn() {
			@Override
			public int max(int n1, int n2) {
//				if ((n1 - n2) > 0) {
//					return n1;
//				} else if ((n1 - n2) < 0) {
//					return n2;
//				}
//				return -1;
				return n1 > n2 ? n1 : n2;
			}
		}.max(1, 10));

		// [문제 3] 문제 1을 람다로 표현
		MaxReturn lambdaMax = (int n1, int n2) -> n1 > n2 ? n1 : n2;
//			if ((n1 - n2) > 0) {
//				return n1;
//			} else if ((n1 - n2) < 0) {
//				return n2;
//			}
//			return -1;
		System.out.println(lambdaMax.max(3, 3));

		// [문제 4] 문제 2를 람다로 표현 			불가능 - 타입을 추정할 수 없기 때문에
//		System.out.println(new MaxReturn() {
//			(int n1, int n2) -> {
//				if ((n1 - n2) > 0) {
//					return n1;
//				} else if ((n1 - n2) < 0) {
//					return n2;
//				}
//				return -1;
//			}
//		}.max(1, 10));
	}
}
