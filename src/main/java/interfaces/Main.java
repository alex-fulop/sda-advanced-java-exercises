package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Shape shape = new Circle();

		List<String> newList = new ArrayList<>();

		shape.rollAround();
		shape = new Triangle();
		shape.rollAround();
	}
}
