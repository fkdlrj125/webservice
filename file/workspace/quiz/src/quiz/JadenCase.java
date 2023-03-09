package quiz;

public class JadenCase {
	public static void main(String[] args) {
		String s = "3people Unfollowed Me";
		System.out.println(s);
		if(s.charAt(0)+'0'>96) {
			s=s.replace(s.charAt(0), (char)(s.charAt(0)-32));
		}
		System.out.println(s.replace(s.charAt(0), (char)(s.charAt(0)-32)));
		System.out.println(s);
	}
}
