package abstractClass;

public abstract class Vehicle {
	int topSpeed;
	int numberOfWheels;

	abstract void drive();

	void start() {
		System.out.println("the car just started");
	}
}
