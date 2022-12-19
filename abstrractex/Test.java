package abstrractex;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		//Computer c1 = new Computer() ;
		Desktop c2 = new  Desktop();
		//NoteBook c3 = new NoteBook();
		MyNoteBook c4 = new MyNoteBook();
		c2.display();
		c2.typing();
		c4.display();
		c4.typing();
		
		int[] arr = {1,2,3};
		System.out.println(arr.toString());//Object.toString()
		System.out.println(Arrays.toString(arr));
		
		
	}

}
