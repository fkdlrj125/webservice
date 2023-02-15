/*
 * [랜덤값]
 * 0<=랜덤값<1 의 실수
 * Math.random()
 * 원하는 범위값을 얻기 위해서 *를 이용
 */


public class RandomEx01 {

	public static void main(String[] args) {
		
		//랜덤값 : 1~3
		//System.out.println((int)(Math.random()*3+1));
		
		//랜덤값 : 1~100
		System.out.println((int)(Math.random()*100+1));
	}	
}
