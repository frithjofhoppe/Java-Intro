package com.herdt.java8.kap05;

class ControlFor {
	public static void main(String[] args) {
		int result = 1;
		int number = 0;

		number = Integer.parseInt(args[0]); // Zahl einlesen

		if ((number > 1) && (number <= 15)) // zulaessiger Bereich 1-15
		{
			for (int i = 1; i <= number; i++) {
				result = result * i; // oder kurz: result *= i;
			}

			System.out.printf("Die Fakultaet von %d ist %d%n", number, result);
		} else {
			System.out.println("Zahl lag ausserhalb des zulaessigen Bereichs.");
		}
	}
}