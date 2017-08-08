package chapter13.collections.demo.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String args[]) {

		// Deklaration Liste mit Elementen vom Typ Integer
		List<Integer> numbers = new ArrayList<Integer>();

		// Elemente hinzufügen
		numbers.add(2); // index 0
		numbers.add(4); // index 1
		numbers.add(6); // index 2, oops, wrong entry
		numbers.add(8); // index 3

		// Elemente lesen
		Integer wrongEntry = numbers.get(2); // wrongEntry = 6

		// Element löschen
		numbers.remove(2);

		// Elemene auslesen via foreach Schleife
		for (Integer number : numbers) {
			System.out.println(number);
		}
	}

}
