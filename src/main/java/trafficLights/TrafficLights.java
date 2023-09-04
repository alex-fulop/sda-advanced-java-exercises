package trafficLights;

public enum TrafficLights {
	RED, YELLOW, GREEN;

	private static final TrafficLights[] VALUES = values();

	public TrafficLights next() {
		return VALUES[(this.ordinal() + 1) % VALUES.length];
	}
}
