package polymorphism;

public class Violin implements Instrument{

	@Override
	public void playSound() {
		System.out.println("Playing the Violin");
	}

	public void breakCord() {
		System.out.println("Boing... the violin broke a cord..");
	}
}
