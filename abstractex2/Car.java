package abstractex2;

public abstract class Car {
	public void start() {
		System.out.println("시동을 겁니다.");
	}
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	public void washCar() {
		System.out.println("세차를 합니다");
	}
	public final void run() {
		start();
		drive();
		stop();
		turnoff();
	}

}
