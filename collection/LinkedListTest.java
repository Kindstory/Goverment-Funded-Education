package collection;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String []args) {
		LinkedList<String> chrisList = new LinkedList<String>();
		
		chrisList.add("A");
		chrisList.addLast("B");
		chrisList.addLast("C");
		
		System.out.println(chrisList);
		
		chrisList.add(1, "D");
		System.out.println(chrisList);
		
		chrisList.addFirst("O");
		System.out.println(chrisList);
		
		System.out.println(chrisList.removeLast());
		System.out.println(chrisList);
		
	}

}
