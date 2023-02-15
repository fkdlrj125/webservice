
public class NestedLoopQuiz03 {
	public static void main(String[] args) {
		
		for(int y=0;y<3;y++) {
			for(int x=0;x<3;x++) {
				if(y==x) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}
