package inter;

import javax.lang.model.element.Element;

interface Vehicle{
	void printNumber();
}

class Car implements Vehicle{
	int carNumber;
	public Car(int number) {
		this.carNumber=number;
	}
	@Override
	public void printNumber() {
		System.out.printf("자동차 등록번호 : %d\n",carNumber);
	}
	public void drive() {
		System.out.println("자동차가 고속도로를 달립니다.\n");
	}
}
class Yacht implements Vehicle{
	int yachtNumber;
	public Yacht(int number) {
		this.yachtNumber=number;
	}
	@Override
	public void printNumber() {
		System.out.printf("요트 등록번호 : %d\n",yachtNumber);
	}
	public void sail() {
		System.out.println("요트가 한강 위를 떠다닙니다.\n"); 
	}
}


public class Ex04 {
	public static void main(String[] args) {
		Vehicle[] myVehicles = {new Car(8586),new Yacht(679111)};
		
//		for(int i=0; i<myVehicles.length; i++) {
//			myVehicles[i].printNumber();
//			if(myVehicles[i] instanceof Car) {
//				((Car)myVehicles[i]).drive();
//			} else if(myVehicles[i] instanceof Yacht) {
//				((Yacht)myVehicles[i]).sail();
//			}
//		}
		for(Vehicle e:myVehicles) {
			e.printNumber();
			if(e instanceof Car) {
				((Car)e).drive();
			} else if(e instanceof Yacht) {
				((Yacht)e).sail();
			}
		}
		// [반복문] 사용
		// : drive method와 sail method 호출
		// : printNumber method 정의 후 호출
		//  실행 결과
		//  자동차 등록번호 : 8586
		//  자동차가 고속도로를 달립니다.
		
		//  요트 등록번호 : 679111
		//  요트가 한강 위를 떠다닙니다.
	}
}
