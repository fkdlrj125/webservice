//	<<서식 문자>>

//	%d : 정수
//	%f : 실수
//	%c : 문자
//	%s : 문자열


public class ForQuiz01 {
	public static void main(String[] args) {
		
		for(int i=1; i<6; i++) {
			//System.out.println(2+"*"+(i*2)+"="+(2*(i*2)));
			System.out.printf("2 * %d = %d\n",i*2,i*2*2);
		}
	}
}
