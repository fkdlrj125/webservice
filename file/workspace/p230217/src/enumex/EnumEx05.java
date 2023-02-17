package enumex;

enum Shoes{
	WALKING("워킹화"), RUNNING("런닝화"), TRACKING("트레킹화"), HIKING("등산화");
	private String name;
	private Shoes(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class EnumEx05 {
	public static void main(String[] args) {
		System.out.println("<<상수 출력>>");
		for(Shoes s:Shoes.values()) {
			System.out.println(s);
		}
		System.out.println("\n<<초기화값 출력>>");
		for(Shoes s:Shoes.values()) {
			System.out.println(s.getName());
		}
		System.out.println("\n<<서수 출력>>");
		for(Shoes s:Shoes.values()) {
			System.out.println(s.ordinal());
		}
		
	}
}
