
public class ArrayEx04 {
	public static void main(String[] args) {
		
		int[][] arr = new int[2][]; 		// 열의 길이 생략 가능 -> 행을 먼저 만들기 때문에 가능
											// 행의 값은 null 
		arr[0] = new int[2];				//열 생성
		arr[1] = new int[] {8,10,12};
		
		for(int[] i:arr) {
			for(int j:i) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
