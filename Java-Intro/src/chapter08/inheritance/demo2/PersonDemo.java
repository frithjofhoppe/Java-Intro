package chapter08.inheritance.demo2;

import java.util.ArrayList;

public class PersonDemo {

	public static void main(String[] args) {

		Person person = new Person("James Bond", 1995);
		Mitarbeiter mitarbeiter = new Mitarbeiter("Mitarbeiter Max", 19965,
				75000);
		Kunde kunde = new Kunde("Peter Müller", 1985, 1234);

		// Liste vom Typ der Oberklasse (Person)
		ArrayList<Person> list = new ArrayList<Person>();

		list.add(person);
		list.add(mitarbeiter);
		list.add(kunde);

		// Ausgabe der Personen (inkl. Unterklassen)
		for (Person p : list) {
			// Anzeige aller Personen mit Hilfe von Overriding (Late Binding)
			System.out.println(p.toString());
		}

	}
}
