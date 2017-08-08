package chapter04.language.demo;

public class PrePostFix {

	/**
	 * Beispiel zu Pre- und Postfix Increments.
	 */
	public static void main(String[] args) {

		int i = 10;
		int j = 10;
		int resultat;

		resultat = 2 * ++i; // i = 11, resultat = 22
		System.out.println(resultat);
		System.out.println(i);

		resultat = 2 * j++; // resultat = 20, j = 11
		System.out.println(resultat);
		System.out.println(j);
	}

}
