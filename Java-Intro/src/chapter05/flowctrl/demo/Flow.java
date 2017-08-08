package chapter05.flowctrl.demo;

public class Flow {

	/**
	 * Beispiel zu einem Programmablauf.
	 */
	public static void main(String[] args) {
		int zahl1, zahl2, ergebnis;

		zahl1 = Integer.parseInt(args[0]);
		zahl2 = Integer.parseInt(args[1]);

		ergebnis = zahl1 * zahl2;

		System.out.println("Das Produkt ist: " + ergebnis);
	}

}
