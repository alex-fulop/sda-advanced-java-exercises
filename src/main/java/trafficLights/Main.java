package trafficLights;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		TrafficLights lights = TrafficLights.RED;

		while (true) {
			System.out.println("The light is " + lights.name());
			Thread.sleep(5000);
			lights = lights.next();
		}
	}
}
