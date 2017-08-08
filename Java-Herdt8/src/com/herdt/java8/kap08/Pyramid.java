package com.herdt.java8.kap08;

/*
* Beschreibung einer Pyramide
*/
class Pyramid extends Rectangle {
	/*
	 * Attribute
	 */
	private int height;

	/*
	 * Getter und Setter
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	/*
	 * Konstruktoren
	 */
	Pyramid() {
		this(1, 1, 1);
		setHeight(20);
	}

	Pyramid(int width, int length, int height) {
		super(width, length); // Konstruktor der Superklasse wird aufgerufen
		setHeight(height);
	}

	/*
	 * Methoden
	 */
	int getBase() {
		return super.getArea();
	}

	public int getVolume() {
		return getWidth() * getLength() * getHeight() / 3;
	}

	int getArea() {
		return -1;
	}
}
