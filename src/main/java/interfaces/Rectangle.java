package interfaces;

public class Rectangle extends Shape implements LoudShape, VolumeShape {
	int length;
	int width;

	Rectangle(int length, int width, int sides) {
		super.sides = sides;
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public void draw() {
		System.out.println("drawing a rectangle...");
	}

	@Override
	public void makeNoise() {
		System.out.println("AAAAAAAAA....");
	}

	@Override
	public double getVolume() {
		return width * width * width;
	}
}
