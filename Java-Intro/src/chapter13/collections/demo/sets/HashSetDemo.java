package chapter13.collections.demo.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Person> persons = new HashSet<Person>();

		Person astrid = new Person(25, "Astrid", "Lindgren");
		Person pipi = new Person(42, "Pipi", "Langstrumpf");
		Person annika = new Person(7, "Annika", "Halström");

		persons.add(astrid);
		persons.add(pipi);
		persons.add(annika);

		System.out.println("Personen:");
		for (Person person : persons) {
			System.out.println(person.toString());
		}
		System.out.println();

		System.out.print("Enthält die Liste Pipi: ");
		System.out.println(persons.contains(pipi)); // Resultat = true

		System.out.print("Pipi noch einmal eingefügt: ");
		System.out.println(persons.add(pipi)); // Resultat = false
	}
}
