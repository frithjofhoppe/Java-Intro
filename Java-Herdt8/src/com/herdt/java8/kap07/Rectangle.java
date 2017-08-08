package com.herdt.java8.kap07;

/**
 * Beschreibung eines Rechtecks mit den beiden Attributen - width (Breite) -
 * length (Laenge)
 */

class Rectangle {
	// Attribute
	private int width = 0; // Attribut Breite
	private int length = 0; // Attribut Laenge

	// Getter und Setter
	int getWidth() {
		return width;
	}

	int getLength() {
		return length;
	}

	void setWidth(int width) {
		this.width = width;
	}

	void setLength(int length) {
		this.length = length;
	}

	// Constructor
	Rectangle() {
		this(1, 1); // Konstruktoraufruf: Rechteck mit Breite=1 und Laenge=1
	}

	Rectangle(int width) {
		this(width, width); // Konstruktoraufruf: Breite = Laenge (Quadrat)
	}

	Rectangle(int width, int length) // allgemeines Rechteck
	{
		setWidth(width);
		setLength(length);
	}

	// Methoden
	void swapWidthLength() {
		int temp = getWidth();
		setWidth(getLength());
		setLength(temp);
	}

	void buildSquare(int sideLength) {
		setWidth(sideLength);
		setLength(sideLength);
	}

	void resize(int width, int length) {
		setWidth(width);
		setLength(length);
	}

	void resize(double factor) {
		setWidth((int) (factor * getWidth()));
		setLength((int) (factor * getLength()));
	}

	int getArea() {
		return getWidth() * getLength();
	}

}