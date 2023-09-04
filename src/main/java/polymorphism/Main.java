package polymorphism;

public class Main {
	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[3];

		instruments[0] = new Guitar();
		instruments[1] = new Piano();
		instruments[2] = new Violin();

		for(Instrument instrument: instruments) {
			System.out.println("The instrument changes it's form...");

			if(instrument instanceof Violin) {
				((Violin) instrument).breakCord();
			} else {
				System.out.println("nothing happens....");
			}

			instrument.playSound();
		}

	}
}
