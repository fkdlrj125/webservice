
public class ArrayEx02CleanCode {
	public static void main(String[] args) {

//		int[] math=new int[5];	//		math = new int[5];
		
		int[] math = new int[] {80,95,90,70,100}; //생성과 동시에 초기화할 땐 길이 생략
//		math[0] = 80;
//		math[1] = 95;
//		math[2] = 90;
//		math[3] = 70;
//		math[4] = 100;
		
		
			
		System.out.println("배열의 길이 >> "+math.length);
		
		for(int i=0;i<math.length;i++) {
			System.out.println("math["+i+"] >> "+math[i]);
		}
				
		
	}
}
