package enumerations;

public class Main {
	public static void main(String[] args) {
//		DaysOfTheWeek today = DaysOfTheWeek.TUESDAY;
//
//		if(today == DaysOfTheWeek.FRIDAY) {
//			System.out.println("YAY TODAY IS FRIDAY");
//		} else if(today == DaysOfTheWeek.SATURDAY || today == DaysOfTheWeek.SUNDAY) {
//			System.out.println("It's weekend");
//		} else {
//			System.out.println("Working :/");
//		}

		Sizes mySize = Sizes.L;

		System.out.println("My size is: " + mySize);
		System.out.println("My size is: " + mySize.getSizeInNrs());

		mySize.evaluateSize(mySize);
	}
}
