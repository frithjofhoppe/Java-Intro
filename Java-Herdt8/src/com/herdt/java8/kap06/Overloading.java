package com.herdt.java8.kap06;

class Overloading {
	public static void main(String[] args) {
		Rectangle specialRect = new Rectangle();
		Rectangle anotherRect = new Rectangle();
		specialRect.width = 5;
		specialRect.length = 8;
		anotherRect.width = 3;
		anotherRect.length = 2 * anotherRect.width;

		System.out.printf("1. Rechteck:%nBreite: %d%nLaenge: %d%n", specialRect.width, specialRect.length);
		System.out.printf("2. Rechteck:%nBreite: %d%nLaenge: %d%n", anotherRect.width, anotherRect.length);

		specialRect.resize(3, 7);
		System.out.printf("1. Rechteck (veraendert):%nBreite: %d%nLaenge: %d%n", specialRect.width, specialRect.length);
		anotherRect.resize(5.0);
		System.out.printf("2. Rechteck (vergroessert):%nBreite: %d%nLaenge: %d%n", anotherRect.width,
				anotherRect.length);
	}
}
