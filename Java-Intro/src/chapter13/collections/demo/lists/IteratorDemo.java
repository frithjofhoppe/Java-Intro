package chapter13.collections.demo.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String args[]) {

		// Deklaration Liste mit Elementen vom Typ Integer
		List<Integer> numbers = new ArrayList<Integer>();

		// Elemente hinzufügen
		numbers.add(2);
		numbers.add(4);
		numbers.add(8);

		// Verwendung Iterator mit while Schlaufe
		Iterator<Integer> it = numbers.iterator();

		while (it.hasNext()) {
			Integer number = (Integer) it.next();

			System.out.println(number);
		}

		// // Ausgabe mit der toString Methode
		// System.out.println(numbers.toString());
	}

}
