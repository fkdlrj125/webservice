import phone.*;

public class PhoneBook {
	public static void main(String[] args) {
		String select = "";
		PhoneBookManager book = new PhoneBookManager();
		
		menu:
		while (true) {
			MenuViewer.showMenu();
			select = MenuViewer.INPUT.next();
			
			switch (select) {
			case "1": {
				book.inputData();
				break;
			}
			case "2": {
				book.searchData();
				break;
			}
			case "3": {
				book.deleteData();
				break;
			}
			case "4": {
				book.allData();
				break;
			}
			case "5": {
				System.out.println("프로그램을 종료합니다.");
				break menu;
			}
			default:
				System.out.println("잘못된 입력입니다.");
			}
			System.out.println();
		}
		MenuViewer.INPUT.close();
	}
}
