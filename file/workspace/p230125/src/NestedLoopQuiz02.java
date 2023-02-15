
public class NestedLoopQuiz02 {
	public static void main(String[] args) {
		int n1=2;
		int n2=0;
		
		while(n1<10) {
			n2=1;
			while(n2<10) {
				System.out.println(n1+" * "+n2+" = "+(n1*n2));
				n2++;
			}
			n1++;
			System.out.println();
		}
	}
}
