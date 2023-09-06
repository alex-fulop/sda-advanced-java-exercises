package exceptions;

public class Main {
	public static void main(String[] args) {

		AgeVerifier.verifyAge(16);











//		int result = 0;

//		try {
////			result = divide(1200, 0);
//
//		} catch (ArithmeticException ae) {
//			System.out.println("Not ok." + ae.getMessage());
//		}
//		System.out.println("The result is: " + result);
	}

//	Exceptii Checked si exceptii Unchecked
//	Compile time si runtime

	public static int divide(int dividend, int divisor) throws ArithmeticException, InterruptedException {
		Thread.sleep(4999);
		int result = dividend / divisor;
		return result;
	}

}
