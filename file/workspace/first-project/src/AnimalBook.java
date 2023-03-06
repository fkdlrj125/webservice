//import java.util.Scanner;

import book.BookManager2;

public class AnimalBook {
	private static BookManager2 manager = new BookManager2();
	
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
		String check = "";

		menu:
		while (true) {
			System.out.print("정보 입력할까요? (Y/N) ... ");
//			check = input.nextLine().toLowerCase();
			check = manager.input.next();
//			if (check.contains("y")) {
//				System.out.println("<<정보를 입력하세요>>");
//				manager.inputData();
//			} else {
//				System.out.println("정보 입력을 종료합니다.\n");
//				System.out.println("<< 저장 목록 >>");
//				manager.showBook();
//				break;
//			}
			switch (check) {
			case "y": case "Y": case "YES": case "Yes": case "yes": {
				System.out.println("<<정보를 입력하세요>>");
				manager.inputData();
				break;
//				continue;
			}
			case "n": case "N": case "NO": case "No": case "no": {
				System.out.println("정보 입력을 종료합니다.\n");
				System.out.println("<< 저장 목록 >>");
				manager.showBook();
				break menu;
			}
			default:
				System.out.println("(Y/N) 둘 중에 하나를 입력해주세요 ... ");
//				continue;
			}
//			break;
		}
//		input.close();
		manager.input.close();
		
	}
}
