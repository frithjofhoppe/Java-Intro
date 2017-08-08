package chapter04.language.demo;

public class Operators {

	/**
	 * Beispiel arithmetische Operatoren.
	 */
	public static void main(String[] args) {

		int x = 8;
		int y = 4;
		int resultat;

		resultat = x + y; // resultat = 12
		System.out.println(x + " + " + y + " = " + resultat);

		resultat = x - y; // resultat = 4
		System.out.println(x + " - " + y + " = " + resultat);

		resultat = x * y; // resultat = 32
		System.out.println(x + " * " + y + " = " + resultat);

		resultat = x / y; // resultat = 2
		System.out.println(x + " / " + y + " = " + resultat);
	}
}
