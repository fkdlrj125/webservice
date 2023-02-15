/*
 *  1.무한 루프(loop)
 *  좋고 나쁨의 개념이 아님
 *  코드 작성 기법 중 하나
 *  반복문 내에 break 명시(필수) 
 *  
 *  2.break
 *  반복문 내에서 조건문과 함께 사용
 *  의미 : 반복문을 탈출
 *  
 *  
 *  
 *  while(true){ >>무한루프
 *  
 *  }
 */

public class WhileEx02 {
	public static void main(String[] args) {
		
		int idx=1;
		
		//무한 루프문(반복문) 구현
//		while(true) {
//			System.out.println("idx >> "+idx);
//			if(idx>9) {
//				break;
//			}
//			idx++;
//		}
		while(idx <= 3) {
			System.out.println("idx >> "+idx);
			idx++;
		}
	}
}
