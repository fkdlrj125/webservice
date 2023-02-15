/*
 * 	[for문]
 * 
 * 	for(초기값;조건식;증감식){
 * 		명령어;
 * 	}
 * 
 */


public class ForEx01 {
	public static void main(String[] args) {
		
		int idx = 1;
		
		while(idx < 3) {
			System.out.println("[while문] idx >> "+idx);
			idx++;
		}
		
		for(idx=1;idx<3;idx++) {
			System.out.println("[for문] idx >> "+idx);
		}
		
	}
}
