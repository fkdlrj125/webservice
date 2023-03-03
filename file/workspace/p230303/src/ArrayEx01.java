import java.util.Arrays;

public class ArrayEx01 {
	public static void main(String[] args) {
//		1. 길이가 3인 String 1차원 배열 생성
		String[] str = new String[3];
		str[0] = "one";
		str[1] = "two";
		str[2] = "three";
//		str[3] = "four";	- 길이를 벗어나서 error

		for (String s : str) {
			System.out.println(s);
		}

//		배열을 문자열로 출력
		System.out.println("<< 배열을 문자열로 출력 >>");
		System.out.println(Arrays.toString(str));

//		배열 복사
//		- 얕은 복사 : shallow copy - 같은 주소를 공유
		String[] shallowCopy = str;

		System.out.println("\n<< shallow copy >>");
		for (String s : shallowCopy)
			System.out.println(s);

//		- 요소 변경 : 인덱스 1의 값을 ten으로 변경
		shallowCopy[1] = "ten";

		System.out.println("\n<<shallowCopy 인덱스 1의 값을 ten 변경 후 >>");
		for (String s : shallowCopy)
			System.out.println(s);

		System.out.println("\n<< str 배열>>");
		for (String s : str) {
			System.out.println(s);
		}

//		- 깊은 복사 : deep copy
		String[] deepCopy = Arrays.copyOf(str, 3);

		System.out.println();
		for (int i = 0; i < deepCopy.length; i++) {
			System.out.printf("deepCopy[%d] : %s\n", i, deepCopy[i]);
		}
		
//		- 요소 변경 : 인덱스 1의 값을 안녕~로 변경
		deepCopy[0] = "안녕~";

		System.out.println("\n<<deepCopy 인덱스 1의 값을 '안녕~' 변경 후 >>");
		for (int i = 0; i < deepCopy.length; i++) {
			System.out.printf("deepCopy[%d] : %s\n", i, deepCopy[i]);
		}

		System.out.println("\n<< str 배열>>");
		for (String s : str) {
			System.out.println(s);
		}

	}
}
