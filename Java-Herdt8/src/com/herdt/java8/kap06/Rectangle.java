package com.herdt.java8.kap06;

/**
 * Beschreibung eines Rechtecks mit den beiden Attributen - width (Breite) -
 * length (Laenge)
 */

class Rectangle // Klassendefinition
{
	// Attribute

	int width = 0; // Attribut Breite
	int length = 0; // Attribut Laenge

	// einfache Methode
	void swapWidthLength() {
		int temp = width; // lokale Variable
		width = length;
		length = temp;
	}

	// Methode mit einem Parameter
	void buildSquare(int sideLength) {
		width = sideLength;
		length = sideLength; // Moegliche Kurzschreibweise:
								// width = length = sideLength;
	}

	// Methode mit Parameter und ohne Rueckgabewert
	int getArea() {
		return width * length;
	}

	// Methode ueberladen
	void resize(int newWidth, int newLength) {
		width = newWidth;
		length = newLength;
	}

	void resize(double factor) {
		width = (int) (width * factor);
		length = (int) (length * factor);
		// auch moeglich:
		// resize((int)(width * factor), (int)(length * factor));
	}
}