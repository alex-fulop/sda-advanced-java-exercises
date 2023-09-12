package generics.game;

public class Enemy implements Entity{
	private String name;

	public Enemy(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	//	cream o clasa pentru enemy
	@Override
	public void draw() {
		System.out.println("An enemy is drawn on the screen");
	}
}
