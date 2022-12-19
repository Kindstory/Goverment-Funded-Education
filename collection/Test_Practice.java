package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test_Practice {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(32);
		list.add(43);
		list.add(76);
		list.add(23);
		Collections.sort(list, new MyComparator()); 
		// Collections.sort에는 이미 comparable이 구현 되어있어서 오름차순으로 자동으로 나옴.
 		System.out.println(list);
	}
}


class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer s1, Integer s2) {
		return (s1 - s2)* -1;
	}
}
