
public class ArrayEx03CleanCode {
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {2, 4, 6, 8, 10}; 		// 1차원 배열
//		int[][] arr2 = new int[][] {{2, 4},{8, 10, 12}};	// 2차원 배열 자바는 열의 길이가 달라도 생성 가능
		int[][] arr2 = {{2, 4},{8, 10, 12}};			// 배열 생성과 동시에 초기화할 땐 new 자료형 생략 가능
		
		for(int[] i:arr2) {
			for(int j:i) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
	}
}
