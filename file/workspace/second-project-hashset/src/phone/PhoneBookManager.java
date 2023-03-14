package phone;

import java.util.HashSet;
import java.util.Iterator;

public class PhoneBookManager {
	private HashSet<PhoneBookInfo> infoStorage = new HashSet<PhoneBookInfo>();

	public void inputData() {
		System.out.println("데이터 입력을 시작합니다..");
		System.out.print("이름 : ");
		String name = MenuViewer.INPUT.next();
		System.out.print("번호 : ");
		String number = MenuViewer.INPUT.next();
		infoStorage.add(new PhoneBookInfo(name, number));
		System.out.println("데이터 입력이 완료되었습니다.");
	}

	public void searchData() {
		System.out.println("데이터 검색을 시작합니다..");
		System.out.print("이름 : ");
		String name = MenuViewer.INPUT.next();
		Iterator<PhoneBookInfo> itr = infoStorage.iterator();
		PhoneBookInfo info;
		while(itr.hasNext()) {
			info = itr.next();
			if(info.name.equals(name)) {
				info.showPhoneInfo();
				System.out.println("데이터 검색이 완료되었습니다.");
				return;
			}
		}
		System.out.println("해당하는 데이터가 존재하지 않습니다.");
	}

	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다..");
		System.out.print("이름 : ");
		String name = MenuViewer.INPUT.next();
		PhoneBookInfo info;
		Iterator<PhoneBookInfo> itr = infoStorage.iterator();
		while(itr.hasNext()) {
			info=itr.next();
			if(info.name.equals(name)) {
				itr.remove();
				System.out.println("데이터 삭제가 완료되었습니다.");
				return;
			}
		}
		System.out.println("해당하는 데이터가 존재하지 않습니다.");
	}

	public void allData() {
		System.out.println("데이터 전체 조회를 시작합니다..");
		for (PhoneBookInfo info : infoStorage) {
			info.showPhoneInfo();
		}
		System.out.println("모든 데이터 출력이 완료되었습니다.");
	}

}
