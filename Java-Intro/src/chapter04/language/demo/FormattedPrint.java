package chapter04.language.demo;

import util.Reader;

public class FormattedPrint {

	/**
	 * Beispiel formattierte Ausgabe.
	 */
	public static void main(String[] args) {

		// Ausgabe eines String
		String message = Reader.readln("String = ");
		System.out.printf("Sie haben die Meldung <%s> eingegeben.%n", message);

		// Ausgabe von Zahlen
		int min = 12;
		int max = 48;

		System.out.printf(
				"Der gültige Eingabebereich liegt zwischen %d und %d.%n", min,
				max);
	}

}
