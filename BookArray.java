package array;
//219쪽 할 차례
import java.util.Scanner;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		library[0]= new Book("태백산맥","조정래");
		library[1]= new Book("데미안","헤르만헤세");
		library[2]= new Book("토지","박경리");
		library[3]= new Book("어떻게 살것인가","유시민");
		library[4]= new Book("어린왕자","생텍쥐페리");
		
		//for(int i=0; i<library.length;i++) library[i].showBookInfo();
		boolean isBook = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("검색>");
		String title = sc.nextLine();
		for(int i=0; i<library.length;i++) {
			if(title.equals(library[i].getName())) {
				isBook=true;
				break;
			}				
		}
		
		if(isBook)System.out.println("책있음");
		else System.out.println("책없음");
		
		//System.out.println(title);

	}

}
