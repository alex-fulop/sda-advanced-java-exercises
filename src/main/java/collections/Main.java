package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");

		Iterator<String> iterator = fruits.iterator();
		int index = 0;

//		while(iterator.hasNext()) {
//			System.out.println(fruits.get(index));
//			iterator.next();
//			if(index < 2) {
//				index++;
//			}
//		}

		System.out.println(fruits);

		for (String fruit : fruits) {
			System.out.println(fruit.toUpperCase());
		}
	}
}
