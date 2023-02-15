
public class SwitchEx04 {

	public static void main(String[] args) {
		
		int n = 10;
		
//		if(n>=0 && n<10)
//			System.out.println("0이상 10미만의 수");
//		else if(n>=10 && n<20)
//			System.out.println("10이상 20미만의 수");
//		else if(n>=20 && n<30)
//			System.out.println("20이상 30미만의 수");
//		else 
//			System.out.println("30이상 수");
		
		switch(n/10) {
		case 0:
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2:
			System.out.println("20이상 30미만의 수");
			break;
		default:
			System.out.println("30이상 수");
		}
	}
}
