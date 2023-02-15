package per;
/*
 *  [package] : 현재 파일의 위치(경로)
 * 	 - 패키지를 나누면 공간이 분리되서 같은 클래스명을 가져도 사용가능
 * 	 - 1개 이상의 package는 올 수 없음
 * 	 - 파일의 첫 라인에 와야 함
*/
class Circle {
	double rad;
	final double PI;

	public Circle(double r) {
		rad = r;
		PI = 3.14;
	}

	public double getPerimeter() {
		return (rad * 2) * PI;
	}
}

public class CirclePerimetr {
	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		System.out.println("반지름이 1.5인 원의 둘레 : " + c.getPerimeter());
	}
}
