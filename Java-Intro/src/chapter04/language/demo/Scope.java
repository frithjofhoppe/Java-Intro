package chapter04.language.demo;

public class Scope {

	// Konstante
	public static final int MAX_GEWICHT = 2500;

	// Globale Variable
	public static int z = 1000;

	public static void print() {
		// Lokale Variablen
		int x = 3;
		int y = 5;

		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}

	public static void main(String[] args) {
		// Lokale Variable
		int x = 100;
		int y = 500;

		// Setzen der globalen Variablen
		z = 99;

		System.out.println("Main:");
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);

		System.out.println("Methode Print:");
		print();

		System.out.println("Konstante max. Gewicht:");
		System.out.println(MAX_GEWICHT);
	}

}
