package abstractex2;

public abstract class Car {
	public void start() {
		System.out.println("�õ��� �̴ϴ�.");
	}
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	public void washCar() {
		System.out.println("������ �մϴ�");
	}
	public final void run() {
		start();
		drive();
		stop();
		turnoff();
	}

}
