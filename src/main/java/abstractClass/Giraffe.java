package abstractClass;

public class Giraffe extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("AAAAAAA!");
	}

	@Override
	public void run() {
		System.out.println("runs way faster");
	}
}
