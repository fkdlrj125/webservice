
public class ArrayEx03 {
	public static void main(String[] args) {
		
		int[] arr1 = new int[5]; 		// 1차원 배열
		int[][] arr2 = new int[2][3];	// 2차원 배열
		
		arr2[0][0] = 2;
		arr2[0][1] = 4;
		arr2[0][2] = 6;
		arr2[1][0] = 8;
		arr2[1][1] = 10;
		arr2[1][2] = 12;
 
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++)
				System.out.print(" "+arr2[i][j]);
			
			System.out.println();
			
		}
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++){
				System.out.print(" "+arr2[i][j]);
			}
			System.out.println();
		}
		
		for(int[] i:arr2) {
			for(int j:i) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
		System.out.println("arr2.length >> "+arr2.length);			// 행의 길이
		System.out.println("arr2[0].length >> "+arr2[0].length);	// 열의 길이
		
		System.out.println("arr2 >> "+arr2);
		System.out.println("arr2[0] >> "+arr2[0]);			// 첫 번재 1차원 배열의 주소
		System.out.println("arr2[0][0] >> "+arr2[0][0]);	// 첫 번째 1차원 배열의 0번째 인덱스 값
	}
}
