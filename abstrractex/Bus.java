package abstrractex;

public class Bus extends Car{
	@Override
	public void run() {
		System.out.println("������ �޸���.");		
	}
	
	@Override
	public void refuel() {
		System.out.println("õ�������� �����մϴ�.");			
	}
	
	public void takePassenger() {
		System.out.println("�°��� ������ �¿�ϴ�.");
	}
	
}
