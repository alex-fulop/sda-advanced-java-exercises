package exceptions;

public class AgeVerifier {
	public static void verifyAge(int userAge) {
		try {
			if(userAge < 18) {
				throw new UnderageException("Sorry, you're underage. No access for you :(");
			}
			System.out.println("Congrats you're an adult, you can use our app.");
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}
