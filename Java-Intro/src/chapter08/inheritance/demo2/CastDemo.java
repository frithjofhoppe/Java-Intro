package chapter08.inheritance.demo2;

public class CastDemo {

	public static void main(String[] args) {
		Person person = new Kunde("Peter Müller", 1985, 1234);
		System.out.println(person);

		// Herstellung des ursprünglichen Objekts mit einem cast
		Kunde kunde = (Kunde) person;
		kunde.setKundenNr(99);

		System.out.println(person);
	}
}
