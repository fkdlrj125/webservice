package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager2 {
	private ArrayList<AnimalInfo> infoStorage = new ArrayList<AnimalInfo>();
	public Scanner input = new Scanner(System.in);
	
	public void inputData() {
		String name = "";
		int age = 0;

		System.out.print("이름 : ");
		name = input.next();
		System.out.print("나이 : ");
		age = input.nextInt();

		infoStorage.add(new AnimalInfo(name, age));
		System.out.println("데이터 입력이 완료되었습니다.\n");
	}

	public void showBook() {
		for (AnimalInfo e : infoStorage) { 
			e.showAnimalInfo();
		}
	}
}
