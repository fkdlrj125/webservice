
public class InstanceEx07 {
	public static void increment(int num) { //값복사 
		System.out.println("num >> "+num++);
	}
	
	public static void main(String[] args) {
		int num = 5;
		System.out.println("메소드 호출 전 : "+num); 
		
		increment(num);
		System.out.println("메소드 호출 후 : "+num); // 메소드 내 지역 변수만을 사용해 값 증가X
	}
}
