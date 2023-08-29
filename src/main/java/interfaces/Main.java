package interfaces;

public class Main {
	public static void main(String[] args) {
//		Circle circle = new Circle("red", 0);
//		Rectangle rectangle = new Rectangle(10, 12, 4);

		Line line = new Line(10,4, 5, 2);

		System.out.println("Distance: " + line.distance);
		line.increseDistance(3);

		System.out.println("New Distance: " + line.distance);

		System.out.println("Area of line is : " + line.getArea());

		System.out.println("Sides of line are : " + line.sides);

//		System.out.println(circle.sides);
//		System.out.println(rectangle.sides);

//		System.out.println("circle's color is: " + circle.getColor());
//		System.out.println("circle has : " + circle.getNrOfSides() + " sides");
//		System.out.println("circle's radius is: " + Circle.getRadius());

//		Rectangle rectangle = new Rectangle(10, 12);
//
//		System.out.println("Area for circle: " + circle.getArea());
//		System.out.println("Area for rectangle: " + rectangle.getArea());
	}
}
