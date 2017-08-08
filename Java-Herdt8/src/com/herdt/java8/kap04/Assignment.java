package com.herdt.java8.kap04;

class Assignment {
	public static void main(String[] args) {
		int i; // Definitionen
		int k; // Definitionen
		char c;
		double d = 1.7; // zusaetzlich zur Definition kann eine Variable
						// initialisiert werden

		// --richtige Wertzuweisungen --------
		i = 20; // der Variablen i wird der Wert 20 zugewiesen
		k = i; // der Wert der Variablen i wird ausgelesen und
				// der Variablen k zugewiesen
		c = 'A';

		// --fehlerhafte Wertzuweisungen --------
		// i = 0.15; // 0.15 ist kein gueltiger int-Wert
		// c = "Test"; // "Test" ist kein char-Wert
		// v = 7; // hier ist keine Variable mit dem Namen v definiert
	}
}
