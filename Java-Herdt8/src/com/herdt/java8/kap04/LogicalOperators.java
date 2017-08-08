package com.herdt.java8.kap04;

class LogicalOperators {
	public static void main(String[] args) {
		int k = 0;
		int i = 1;
		boolean b = false;

		b = (k > i) && (k >= 0); // b erhaelt den Wert false, da k nicht
									// groesser als i ist
		System.out.println(b);

		b = (k > i) || (i > k); // b erhaelt den Wert true, da i groesser als k
								// ist
		System.out.println(b);

		b = !b; // b erhaelt den Wert false, da b vorher true war
		System.out.println(b);
	}
}
