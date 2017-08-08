package chapter19.lambda.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda Expression Demo.
 */
public class PersonComparatorDemo {

	public static void main(String[] args) {

		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Pipi", "Langstrump"));
		personList.add(new Person("Michel", "von Löneberga"));
		personList.add(new Person("Peter", "Pan"));

		// Anonyme Klasse die das Interface Comperator implementiert.
		// Das Interface hat die Methode: int compare(T o1, o2);
		// Die compare Methode hat zwei Parameter und gibt einen int Wert mit
		// dem Resultat des Vergleichs zurück.
		Collections.sort(personList, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getFirstname().compareTo(p2.getFirstname());
			}
		});

		print("Sorted inner class: firstname ascending", personList);

		// Lambda Ausdruck anstelle der anonymen Klasse.
		// Der Ausdruck hat 2 Parameter vom Typ Person und gibt einen Wert vom
		// Typ int zurück.
		Collections.sort(personList, (Person p1, Person p2) -> {
			return p1.getFirstname().compareTo(p2.getFirstname());
		});

		print("Sorted with lambda expression: firstname ascending", personList);

		// Mit dem zweiten Lambda Ausdruck wird die Sortierung umgekehrt.
		// Im weiteren ist folgendes zu beachten:
		// 1) Bei den Parametern wird der Typ nicht angegeben. Dieser ist
		// optional falls der
		// Compiler dies aus dem Context selber herausfinden kann (target
		// typing).
		// 2) Die Anweisung verwendet keine Klammern {}. Diese sind optional
		// falls
		// es nur eine Anweisung hat
		// 3) Die Anweisung verwendet kein return statement. Dies ist optional,
		// falls
		// keine Klammern {} verwendet werden.
		Collections.sort(personList, (p1, p2) -> p2.getFirstname().compareTo(p1.getFirstname()));

		print("Sorted with lambda expression: firstname descending", personList);
	}

	private static void print(String title, List<Person> personList) {
		System.out.println(title);
		for (Person p : personList) {
			System.out.println(" - " + p.toString());
		}
	}

} // end
