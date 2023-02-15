
public class NestedLoopEx02 {
	public static void main(String[] args) {
		
		outer: //중첩 반복문에서 for문에 이름을 붙여서 
			   //원하는 반복문 탈출가능
		for(int i=0; i<3; i++) {
			System.out.println("[바깥쪽 for문] "+(i+1)+"차 회전");
			for(int j=0; j<3; j++) {
				System.out.println("\t[안쪽 for문] "+(j+1)+"차 회전");
				
				if(i%2==0) {
					break outer;
				}
					
			}			
			System.out.println();
		}
	}
}
