import java.util.Scanner;

public class NestedLoopQuiz04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("짝수 단은 0, 홀수 단은 1을 입력 : ");
		int user_value=input.nextInt();
		int startDan=(user_value==0)?2:3;
		
		for(int y=startDan;y<10;y+=2) {
			for(int x=1;x<10;x++) {
//				if(user_value==0) {
//					System.out.println(y+" * "+x+" = "+(y*x));
//				}else if(user_value==1) {
//					System.out.println((y+1)+" * "+x+" = "+((y+1)*x));
//				}
				System.out.println(y+" * "+x+" = "+(y*x));
			}
			System.out.println();
		}
		
		input.close();
		
	}
}
