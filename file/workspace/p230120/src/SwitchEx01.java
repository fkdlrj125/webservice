//[조건문] switch문

//switch(값){
//	case 값1:
//		명령어;
//      break;
//	case 값2:
//		명령어;
//      break;
//	default:
//		명령어;
//      break;
//};

public class SwitchEx01 {
	
	public static void main(String[] args) {
		
		int n=3;
		
		switch(n) {
		case 1:
			System.out.println("Simgple Java");
			break;
		case 2:
			System.out.println("Funny Java");
			break;
		case 3:
			System.out.println("Fantastic Java");
			break;
		default:
			System.out.println("The best programming language");
			break;
		};
		
		System.out.println("Do you like coffee?");
	}
}
