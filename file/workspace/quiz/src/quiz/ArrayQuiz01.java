package quiz;

public class ArrayQuiz01 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==0) {
					arr[i][j]=1;
				} else if(i>0 && i<5 && (j==0 || j==4)) {
					arr[i][j]=1;
				} else if(i==4) {
					arr[i][j]=1;
				} else {
					arr[i][j]=0;
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
