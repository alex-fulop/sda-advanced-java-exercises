package generics;
public class Main {
	public static void main(String[] args) {

		// declaram niste array-uri
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		String[] stringArray = {"Bye", "Salut", "Ourevoire"};

//		apelam metoda
		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);

//		printam prima valoare
		System.out.println(getFirst(intArray));
		System.out.println(getFirst(doubleArray));
		System.out.println(getFirst(charArray));
		System.out.println(getFirst(stringArray));
	}

//	metoda pentru afisare a array-ului
//	mai multe metode cu parametrii diferiti = method overloading
	public static <Thing> void displayArray(Thing[] array) {
		for(Thing item: array) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

//	returnam prima valoare din array
	public static <Thing> Thing getFirst(Thing[] array) {
		return array[0];
	}
}
