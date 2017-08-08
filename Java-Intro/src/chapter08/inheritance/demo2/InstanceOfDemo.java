package chapter08.inheritance.demo2;

public class InstanceOfDemo {

	public static void main(String[] args) {
		Person person = new Kunde("Peter Müller", 1985, 77);
		System.out.println(person);

		if (person instanceof Mitarbeiter) {
			Mitarbeiter mitarbeiter = (Mitarbeiter) person;
			mitarbeiter.setLohn(80000);

		} else if (person instanceof Kunde) {
			Kunde kunde = (Kunde) person;
			kunde.setKundenNr(99);
		}

		System.out.println(person);
	}
}
