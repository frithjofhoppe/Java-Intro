package com.herdt.java8.kap08;

/*
* Beschreibung eines Rechtecks
* mit den beiden Attributen
* - breite
* - hoehe
*/

class Rectangle // Klassendefinition
{
	/*
	 * Attribute
	 */
	private int width = 0; // Breite des Rechtecks in cm
	private int length = 0; // Laenge des Rechtecks in cm

	/*
	 * Getter und Setter
	 */
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

	/*
	 * Constructor
	 */
	Rectangle() {
		this(1, 1); // Konstruktoraufruf: Rechteck mit breite=1 und laenge=1
		// System.out.println("ausfuehren: Rectangle()");
	}

	Rectangle(int width) // Quadrat: breite und laenge sind gleich
	{
		this(width, width); // Konstruktoraufruf: breite=laenge
	}

	Rectangle(int width, int length) // allgemeines Rechteck
	{
		setWidth(width);
		setLength(length);
		// System.out.println("ausfuehren: Rectangle(a, b)");
	}

	/*
	 * Methoden
	 */
	void swapWidthLength() // Methode ohne Parameter
	{
		int temp = getWidth(); // lokale Variable
		setWidth(getLength());
		setLength(temp);
	}

	void buildSquare(int sideLength) // Methode mit Parameter
	{
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

	int getArea() // Methode mit Parameter und ohne Rueckgabewert
	{
		return getWidth() * getLength();
	}

}