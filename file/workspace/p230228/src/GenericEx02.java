/*
 * 	[제네릭 메소드]
 */

class Apple{
	@Override
	public String toString() {
		return "사과는 맛있다.";
	}
}

class Banana{
	@Override
	public String toString() {
		return "바나나는 멸종 위기이다.";
	}
}

class InstanceType{
	private int count;
	
//	public void showInstanceType(Apple apple) {
//		System.out.println("type >> "+apple);
//		count++;
//	}
	
//	public void showInstanceType(Object object) {
//		System.out.println("type >> "+object);
//		count++;
//	}
	
	// [제네릭 메소드] - 제네릭 타입을 메소드 밖에 명시
	public <T> void showInstanceType(T fruit) {
		System.out.println("type >> "+fruit);
		count++;
	}
	
	public void showCount() {
		System.out.println("count >> "+this.count);
	}
}

public class GenericEx02 {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Banana banana = new Banana();
		
		InstanceType in = new InstanceType();
		
		in.<Apple>showInstanceType(apple);
		in.showCount();
		
		in.<Banana>showInstanceType(banana);
		in.showCount();
		
		// 타입에 제한이 없기 때문에 모든 타입 사용 가능
		in.<String>showInstanceType("안녕");
		in.showCount();
	}
}
