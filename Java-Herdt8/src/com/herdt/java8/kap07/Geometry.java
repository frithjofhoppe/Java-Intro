package com.herdt.java8.kap07;

class Geometry {
	public static void main(String[] args) {
		// Ein Rechteck mit der Breite 1 und der Laenge 1 erzeugen
		Rectangle specialRect = new Rectangle();

		// Ein Rechteck mit der Breite 3 und der Laenge 5 erzeugen
		Rectangle anotherRect = new Rectangle(3, 5);

		System.out.printf("Das Rechteck (%d x %d)%n", specialRect.getWidth(), specialRect.getLength());
		System.out.printf("hat den Flächeninhalt %d%n", specialRect.getArea());
		System.out.printf("Das Rechteck (%d x %d)%n", anotherRect.getWidth(), anotherRect.getLength());
		System.out.printf("hat den Flächeninhalt %d%n", anotherRect.getArea());
	}
}
