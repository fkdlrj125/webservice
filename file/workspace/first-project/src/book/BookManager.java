package book;

import java.util.Scanner;

public class BookManager {
	private final int MAX_CNT = 100;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
	private int index = 0;

	public void inputData() {
		Scanner input = new Scanner(System.in);
		String name = "";
		int age = 0;

		System.out.print("이름 : ");
		name = input.nextLine();
		System.out.print("나이 : ");
		age = input.nextInt();

		if (index < MAX_CNT) {
			infoStorage[index++] = new AnimalInfo(name, age);
			System.out.println("데이터 입력이 완료되었습니다.\n");
		} else {
			System.out.println("데이터 입력이 불가능합니다.\n");
		}
	}

	public void showBook() {
		for (AnimalInfo e : infoStorage) {
			try {
				e.showAnimalInfo();
			} catch (Exception e2) {
				break;
			}
		}
	}
}
