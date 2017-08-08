package com.herdt.java8.kap04;

class TypeCast {
	public static void main(String[] args) {
		int position = 100; // korrekt
		double size = 1.45; // korrekt
		double weight = 80; // korrekt
		// int number = 1.23; // Compiler liefert Fehlermeldung
		int num = (int) 5.67; // korrekt durch die erzwungene
								// Datentypkonversion: num erhaelt den Wert 5.
								// Die Dezimalstellen entfallen.
		System.out.println(num);
	}
}
