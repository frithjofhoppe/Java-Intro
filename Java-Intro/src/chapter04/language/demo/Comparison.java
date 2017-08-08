package chapter04.language.demo;

public class Comparison {

	/**
	 * Beispiel Vergleichsopertoren.
	 */
	public static void main(String[] args) {

		int x = 8;
		int y = 4;
		boolean test;

		test = (x == y); // resultat = false
		System.out.println(x + " == " + y + " = " + test);

		test = (x > y); // resultat = true
		System.out.println(x + " > " + y + " = " + test);

		test = (x <= y); // resultat = false
		System.out.println(x + " <= " + y + " = " + test);

		test = (x >= y); // resultat = true
		System.out.println(x + " <= " + y + " = " + test);
	}
}
