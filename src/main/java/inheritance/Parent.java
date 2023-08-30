package inheritance;

public class Parent extends GrandParent {
	protected String eyeColor;
	protected String hairColor;

	public Parent(String eyeColor, String hairColor) {
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
	}

	void read() {
		System.out.println("Reading a newspaper");
	}
}
