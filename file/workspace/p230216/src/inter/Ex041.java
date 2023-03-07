package inter;
import java.util.Vector;

interface Vehicle {
	void printNumber();
}

class Car implements Vehicle {

	private int carNumber;
	
	public Car(int carNumber) {
		this.carNumber = carNumber;
	}
	@Override
	public void printNumber() {
		System.out.println("자동차 등록번호 : " + this.carNumber);
	}
	public void drive() {
		System.out.println("자동차가 고속도로를 달립니다.\n");
	}
}

class Yacht implements Vehicle {
	int yachtNumber;
	
	public Yacht(int yachtNumber) {
		this.yachtNumber = yachtNumber;
	}
	
	@Override
	public void printNumber() {
		System.out.println("요트 등록번호 : " + this.yachtNumber);
	}

	public void sail() {
		System.out.println("요트가 한강 위를 떠다닙니다.\n");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Vehicle[] myVehicle = new Vehicle[2];
		myVehicle[0] = new Car(8586);
		myVehicle[1] = new Yacht(67911);  // 한 라인으로 만들 수 있어 꺨꼼하니까.
	
		
		for(Vehicle vehicle:myVehicle) {
			System.out.println(vehicle);
		}
		
		
//		[반복문] 사용_ 배열 -> 향상된 for문(배열용)
//		: drive method와 sail method 호출 >> 정의되어 있음
//		: printNumber method 정의 후 호출 >>
//		<실행결과>
//		자동차 등록번호 : 8586
//		자동차가 고속도로를 달립니다. \n
		
//		요트 등록번호 : 679111
//		요트가 한강 위를 떠다닙니다.
		

	}
}
