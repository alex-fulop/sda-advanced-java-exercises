package collections;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
	public static void main(String[] args) {

		Map<String, String> countries = new TreeMap<>();
		Map<String, String> countries2 = new TreeMap<>();

		countries2.put("RO", "Romania");
		countries.put("US", "United States");
		countries.put("BR", "Brazil");
		countries.put("ES", "Spain");

		countries.putAll(countries2);

		System.out.println(countries.get("RO"));
		System.out.println(countries);

		System.out.println("Keys: " + countries.keySet());
		System.out.println("Values: " + countries.values());

//		Set<String> animal = new TreeSet<>();
//		animal.add("Dog");
//		animal.add("Tiger");
//		animal.add("Cat");
//		animal.add("Lion");
//
//		animal.remove("Lion");
//		animal.add("Lion");
//		animal.add("Lion");
//
//		System.out.println(animal);

//		String[] newAnimals = {"Dolphin", "Giraffe"};
//		animal.addAll(Arrays.asList(newAnimals));
//
//		String[] array = animal.toArray(new String[0]);
//
//		System.out.println(Arrays.toString(array));
//
//		for(int i = 0; i< array.length; i++) {
//			System.out.println(array[i]);
//		}

//		System.out.println(animal);
//		System.out.println(animal.size());
//		while(iterator.hasNext()) {
//			System.out.print(iterator.next() + ", ");
//		}


//		Queue<String> names = new LinkedList<>();

//		names.offer("Ana");
//		names.offer("Dan");
//		names.offer("Andrei");
//		names.add("Claud");
//		names.add("David");

//		names.poll();
//		names.remove();

//		System.out.println(names);
//
//		names.clear();

//		System.out.println(names.poll());
//		names.poll()
//		while (!names.isEmpty()) {
//			System.out.print(names.remove() + " ");
//		}


//		List<String> fruits = new ArrayList<>();
//		List<String> fruits2 = new ArrayList<>();
//
//		fruits2.add("pineapple");
//		fruits2.add("kiwi");
//		fruits2.add("peach");
//
//		fruits.add("Apple");
//		fruits.add("Banana");
//		fruits.add("Orange");
//
//		fruits2.addAll(fruits);

//		fruits2.clear();

//		System.out.println("The size of the fruits list is: " + fruits2.size());

//		fruits.remove("Banana");

//		Iterator<String> iterator = fruits.iterator();
//		int index = 0;
//		while(iterator.hasNext()) {
//			System.out.println(fruits.get(index));
//			iterator.next();
//			if(index < 2) {
//				index++;
//			}
//		}
//		System.out.println(fruits2);

//		for (String fruit : fruits) {
//			System.out.println(fruit.toUpperCase());
//		}
	}
}
