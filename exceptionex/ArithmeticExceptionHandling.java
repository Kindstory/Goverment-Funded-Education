package exceptionex;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		
		int a = 50;
		int b = 0;
		double c = -100;
		int d = -100;
		int f = 102;
		double g = 102;
	
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
			e.getLocalizedMessage();
		}
		
		
		System.out.println(a/c);
		System.out.println(a/d);
		System.out.println(a/f);
		System.out.println(a/g);
		
	}// main
}
