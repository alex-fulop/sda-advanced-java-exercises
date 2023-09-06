package classes;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		Car mercedes = new Car("S-Class", 200);

		mercedes.setSpeed(-400);

		System.out.println("The car goes with a speed of " + mercedes.getSpeed());
//		System.out.println("The model of the car is " + mercedes.getModel());

	}
}