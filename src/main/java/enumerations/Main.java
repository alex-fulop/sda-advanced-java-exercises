package enumerations;

public class Main {
	public static void main(String[] args) {
		DaysOfTheWeek day = DaysOfTheWeek.FRIDAY;

		if(day == DaysOfTheWeek.FRIDAY) {
			System.out.println("YEY IT'S FRIDAY AGAIN");
		} else if(day == DaysOfTheWeek.SATURDAY || day == DaysOfTheWeek.SUNDAY) {
			System.out.println("It's weekend I'm relaxing :) ");
		} else {
			System.out.println("I'm working :/");
		}

		Size sizeOfJeans = Size.XL;

		System.out.println("Your jeans are of size: " + sizeOfJeans);
		System.out.println("Your jeans are of size: " + sizeOfJeans.getSizeInNrs());

	}
}
