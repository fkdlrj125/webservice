import java.util.Scanner;

import book.BookManager;

public class AnimalBook {
	public static void main(String[] args) {
		BookManager manager = new BookManager();
		Scanner input = new Scanner(System.in);
		String check = "";

		while (true) {
			System.out.print("정보 입력할까요? (Y/N) ... ");
			check = input.nextLine().toLowerCase();
			if (check.contains("y")) {
				System.out.println("<<정보를 입력하세요>>");
				manager.inputData();
			} else {
				System.out.println("정보 입력을 종료합니다.\n");
				System.out.println("<< 저장 목록 >>");
				manager.showBook();
				break;
			}
		}
		input.close();
	}
}
