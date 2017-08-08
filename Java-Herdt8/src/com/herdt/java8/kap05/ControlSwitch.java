package com.herdt.java8.kap05;

class ControlSwitch {
	public static void main(String[] args) {
		int result = 0;
		int divisor = 7;
		int number = 0;

		number = Integer.parseInt(args[0]); // Zahl einlesen

		if (number > 0) {
			result = number % divisor; // ganzzahliger Divisionsrest berechnen

			switch (result) {
			case 0:
				System.out.printf("Die Zahl ist durch %d teilbar.%n", divisor);
				break;
			case 1:
				System.out.println("Der Divisionsrest betraegt 1.");
				break;
			case 2:
				System.out.println("Der Divisionsrest betraegt 2.");
				break;
			default:
				System.out.println("Der Divisionsrest ist groesser als 2.");
			}
		}
	}
}
