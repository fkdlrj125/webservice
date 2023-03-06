package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
//	ArrayList를 이용하여 AnimalInfo를 저장
	private final int MAX_CNT = 100;
//	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
	private ArrayList<AnimalInfo> infoStorage = new ArrayList<AnimalInfo>();
	private int index = 0;
	public Scanner input = new Scanner(System.in);
	
	public void inputData() {
		//Scanner input = new Scanner(System.in);
		String name = "";
		int age = 0;

		System.out.print("이름 : ");
		name = input.next();
		System.out.print("나이 : ");
		age = input.nextInt();

		if (index < MAX_CNT) {
//			infoStorage[index++]=new AnimalInfo(name, age);
			infoStorage.add(new AnimalInfo(name, age));
			System.out.println("데이터 입력이 완료되었습니다.\n");
		} else {
			System.out.println("데이터 입력이 불가능합니다.\n");
		}
	}

	public void showBook() {
		for (AnimalInfo e : infoStorage) { 
//			try {
//			} catch (Exception e2) {
//				break;
//			}
			e.showAnimalInfo();
		}
	}
}
