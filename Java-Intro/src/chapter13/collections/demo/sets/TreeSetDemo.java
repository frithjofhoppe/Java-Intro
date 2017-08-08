package chapter13.collections.demo.sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<ComparablePerson> persons = new TreeSet<ComparablePerson>();

		persons.add(new ComparablePerson(25, "Astrid", "Lindgren"));
		persons.add(new ComparablePerson(42, "Pipi", "Langstrumpf"));
		persons.add(new ComparablePerson(7, "Tommy", "Halström"));
		persons.add(new ComparablePerson(7, "Annika", "Halström"));

		System.out.println("Personen sortiert nach Vorname, Nachname und Nr:");
		for (ComparablePerson person : persons) {
			System.out.println(person.toString());
		}
	}
}
