import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세요 : ");
		String str1=input.next(); //next()는 공백 전까지만 입력받음
		System.out.println("str1 : "+str1);
		
		input.nextLine();
		
		System.out.print("문자열을 입력해주세요 : ");
		String str2=input.nextLine(); //nextLine()는 enter치기 전까지 입력받음
									  //Enter:CRLF->\r\n 두 개가 합쳐진 것
		System.out.println("str2 : "+str2);
		
	}

}
