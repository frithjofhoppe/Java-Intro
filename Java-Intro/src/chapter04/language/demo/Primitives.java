package chapter04.language.demo;

public class Primitives {

	/**
	 * Primitive Datentypen und Literale.
	 */
	public static void main(String[] args) {

		// Ganzzahlen
		byte b = 12; // -128 ... 127
		short s = 32000; // -32768 ... 32767
		int i = -2147483648; // -2147483648 ... 2147483647
		long l = 9223372036854775807L; // -9223372036854775808 ...
										// 9223372036854775807

		// Gleitkomma Zahlen
		double d = 99.9; // Genauigkeit 7 Stellen
		float f = 12.5f; // Genauigkeit 15 Stellen

		// Zeichen (Charakter)
		char ch = 'Z';

		// Zeichenketten (String) // Achtung:
		String text = "abc"; // String ist ein Objekt und kein primitiver
								// Datentyp!

		// Logische Typen
		boolean wahr = true;
		boolean nichtWahr = false;

		int x = 12;
		int y = 15;
		boolean isXGreaterY = (x > y); // Resultat liefert false

		// Literale
		char E = '\u0045'; // Unicode Zeichen 'E'
		char lineFeed = '\n'; // Line Feed (Zeilenumbruch)
	}

}
