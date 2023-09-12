package generics.game;

public class Player implements Entity{

	// cream o clasa pentru jucator
	private int healthPoints;
	private String name;

	Player(int healthPoints, String name) {
		this.healthPoints = healthPoints;
		this.name = name;
	}

	@Override
	public void draw() {
		System.out.println("The player appears...");
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public String getName() {
		return name;
	}
}
