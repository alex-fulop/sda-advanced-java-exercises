package interfaces;

public class Circle extends Shape{

//	STATIC si FINAL
	private static final int radius = 100;
	private final String color;


	public Circle(String color, int sides) {
		super.sides = sides;
		this.color = color;
	}


	public double getArea() {
		return radius * radius * 3.14;
	}

	public void draw() {
		System.out.println("drawing a circle");
	}

	public static int getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

}
