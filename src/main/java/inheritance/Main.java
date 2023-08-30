package inheritance;

public class Main {
	public static void main(String[] args) {
		Parent parent = new Parent("brown", "black");
		Child child = new Child("blonde", "blue");

		parent.read();
		child.read();

		System.out.println("Child's eye color: " + child.eyeColor);

		child.playFootball();
	}
}
