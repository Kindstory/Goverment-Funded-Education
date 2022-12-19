package array;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(100);
		numbers.add(101);
		numbers.add(102);
		numbers.add(103);
		numbers.add(104);
		
		System.out.println(numbers.size());
		int indx =2;
		if(indx< numbers.size())numbers.remove(indx);
		for(int data :numbers)	System.out.println(data);
		if(numbers.contains(104))System.out.println("104있다");
		else System.out.println("104없다");
		System.out.println(numbers.get(4));
		
	}

}
