package iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {
	
	public static void main(String []args) {
		
		LinkedList<Integer> lnkList = new LinkedList<Integer>();
		lnkList.add(4);
		lnkList.add(2);
		lnkList.add(3);
		lnkList.add(1);
		
		Iterator<Integer> iter = lnkList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
		
		
		System.out.println(iter.hasNext());
		
		
		
	}
	
}
