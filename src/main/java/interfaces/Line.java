package interfaces;

public class Line extends Rectangle{

	int distance;

	Line(int distance, int length, int width, int sides) {
		super(length, width, sides);
		this.distance = distance;
	}

	void increseDistance(int cms) {
		this.distance = this.distance + cms;
	}
}
