import java.util.Scanner;

public class IfQuiz05 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int user_input=input.nextInt();
		char grade=' ';
		char option='0';
		
//		if (/* 100>=user_input && */user_input>=90 ) {
//			if (/* 100>=user_input && */user_input>=97) {
//				grade="A+";
//			} else if (/* 96>=user_input && */user_input>=94) {
//				grade="A0";
//			} else {
//				grade="A-";
//			}
//		} else if (/* 89>=user_input && */user_input>=80) {
//			if (/* 89>=user_input && */user_input>=87) {
//				grade="B+";
//			} else if (/* 86>=user_input && */user_input>=84) {
//				grade="B0";
//			} else {
//				grade="B-";
//			}
//		} else if (/* 79>=user_input && */user_input>=70) {
//			if (/* 79>=user_input && */user_input>=77) {
//				grade="C+";
//			} else if (/* 76>=user_input && */user_input>=74) {
//				grade="C0";
//			} else {
//				grade="C-";
//			}
//		} else {
//			grade="F";
//		}
		
		if(user_input>=90) {
			grade='A';
		} else if(user_input>=80) {
			grade='B';
		} else if(user_input>=70) {
			grade='C';
		} else {
			grade='F';
		}
		
		if(user_input<70) {
			option=' ';
		} else if(user_input%10>=7 || user_input==100) {
			option='+';
		} else if(user_input%10<=3) {
			option='-';
		}
		
		System.out.println("당신의 학점은 "+grade+option+"입니다.");
		
		input.close();
	}
}
