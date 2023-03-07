package phone;

public class PhoneBookManager {
	private final int MAX_CNT = 100;
	private PhoneBookInfo[] infoStorage = new PhoneBookInfo[MAX_CNT];
	private int index = 0;

	private int search(String name) {
		for(int i = 0; i < index; i++) {
			if(infoStorage[i].name.equals(name)) {
				return i;
			} 
		}
		return -1;
	}

	public void inputData() {
		System.out.println("데이터 입력을 시작합니다..");
		System.out.printf("이름 : ");
		String name = MenuViewer.INPUT.next();
		System.out.printf("번호 : ");
		String number = MenuViewer.INPUT.next();
		if(index < MAX_CNT) {
			infoStorage[index++] = new PhoneBookInfo(name, number);
			System.out.println("데이터 입력이 완료되었습니다.");
		} else {
			System.out.println("용량이 초과됐습니다.");
		}
	}

	public void searchData() {
		System.out.println("데이터 검색을 시작합니다..");
		System.out.printf("이름 : ");
		String name = MenuViewer.INPUT.next();
		if(search(name) > -1) {
			System.out.println("이름 : "+infoStorage[search(name)].name);
			System.out.println("번호 : "+infoStorage[search(name)].phoneNumber);
			System.out.println("데이터 검색이 완료되었습니다.");
		} else {
			System.out.println("해당하는 데이터가 존재하지 않습니다.");
		}
	}

	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다..");
		System.out.printf("이름 : ");
		String name = MenuViewer.INPUT.next();
		int searchIndex = search(name);
		if(searchIndex > -1) {
			for(int i = searchIndex; i<index; i++) {
				if(i+1 == index) {
					infoStorage[i] = null;
 					index -= 1;
				} else {
					infoStorage[i] = infoStorage[i+1];
				}
			}
			System.out.println("데이터 삭제가 완료되었습니다.");
		} else {
			System.out.println("해당하는 데이터가 존재하지 않습니다.");
		}
	}

	public void allData() {
		System.out.println("데이터 전체 조회를 시작합니다..");
		for(PhoneBookInfo info : infoStorage) {
			if(info == null) {
				break;
			}
			System.out.println("이름 : "+info.name);
			System.out.println("번호 : "+info.phoneNumber+"\n");
		}
		System.out.println("모든 데이터 출력이 완료되었습니다.");
	}

}
