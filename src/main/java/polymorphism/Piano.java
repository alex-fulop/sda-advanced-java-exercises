package polymorphism;

public class Piano implements Instrument{
	@Override
	public void playSound() {
		System.out.println("Playing the piano");
	}
}
