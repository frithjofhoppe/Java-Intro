package chapter17.streams.exercise;

import java.util.ArrayList;
import java.util.List;

import util.Reader;

public class PersonReader
{
	public Person readPerson()
	{
		System.out.println("Geben Sie bitte eine Person ein:");
		String vorname = Reader.readln("Vorname:");
		String nachname = Reader.readln("Nachname:");
		String jahrgang = Reader.readln("Jahrgang:");

		return new Person(vorname, nachname, jahrgang);
	}

	public List<Person> readPersons()
	{
		boolean isDemanded = true;

		List<Person> persons = new ArrayList<Person>();

		while (isDemanded)
		{
			persons.add(readPerson());

			String input = Reader.readln("\nMöchten sie eine weitere Person erfasse (j/n/everything == n)?");

			switch (input) {
			case "j":
				break;
			case "n":
				isDemanded = false;
				break;
			default:
				break;
			}
		}
		
		return persons;
	}
}
