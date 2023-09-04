package polymorphism;

public class Guitar implements Instrument{

	@Override
	public void playSound() {
		System.out.println("Playing the guitar");
	}
}
