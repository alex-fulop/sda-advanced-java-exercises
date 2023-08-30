package inheritance;

public class Child extends Parent {

	Child(String hairColor, String eyeColor) {
		super(hairColor, eyeColor);

	}

	void playFootball() {
		int heightOfGrandpa = getHeight();
		System.out.println("Child is playing football");
	}
}
