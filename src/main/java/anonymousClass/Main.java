package anonymousClass;

public class Main {
	public static void main(String[] args) {
//		Greeting englishGreeting = new GreetingImplementation();
//		Greeting romanianGreeting = new Greeting() {
//			@Override
//			public void greet() {
//				System.out.println("Ceau!");
//			}
//		};
//
//		Greeting russianGreeting = () -> System.out.println("Priviet!");
//
//		englishGreeting.greet();
//		romanianGreeting.greet();
//		russianGreeting.greet();

		Thread newThread = new Thread() {
			private String time = "20:51";

			@Override
			public void run() {
				System.out.println("The current time is " + time);
			}
		};

		newThread.run();
	}
}
