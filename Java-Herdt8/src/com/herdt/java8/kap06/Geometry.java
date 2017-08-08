package com.herdt.java8.kap06;

class Geometry {
	public static void main(String[] args) {
		// ein Rechteck definieren
		Rectangle specialRect;

		// das Rechteck erzeugen
		specialRect = new Rectangle();

		Rectangle anotherRect = new Rectangle();
		specialRect.width = 5;
		specialRect.length = 8;
		anotherRect.width = 3;
		anotherRect.length = 2 * anotherRect.width;

		System.out.printf("1. Rechteck:%nBreite: %d%nLaenge: %d%n", specialRect.width, specialRect.length);
		System.out.printf("2. Rechteck:%nBreite: %d%nLaenge: %d%n", anotherRect.width, anotherRect.length);
	}
}
