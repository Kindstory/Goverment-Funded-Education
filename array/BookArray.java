package array;
//219�� �� ����
import java.util.Scanner;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		library[0]= new Book("�¹���","������");
		library[1]= new Book("���̾�","�츣���켼");
		library[2]= new Book("����","�ڰ渮");
		library[3]= new Book("��� ����ΰ�","���ù�");
		library[4]= new Book("�����","�������丮");
		
		//for(int i=0; i<library.length;i++) library[i].showBookInfo();
		boolean isBook = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻�>");
		String title = sc.nextLine();
		for(int i=0; i<library.length;i++) {
			if(title.equals(library[i].getName())) {
				isBook=true;
				break;
			}				
		}
		
		if(isBook)System.out.println("å����");
		else System.out.println("å����");
		
		//System.out.println(title);

	}

}
