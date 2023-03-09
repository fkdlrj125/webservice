package quiz;

import java.util.ArrayList;
import java.util.Comparator;

public class MaxMin {
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		ArrayList<Integer> list = new ArrayList<>();
		for(String str : s.split(" ")) {
			list.add(Integer.parseInt(str));
		}
		
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		
		for(int e : list) {
			System.out.println(e);
		}
	}
}
