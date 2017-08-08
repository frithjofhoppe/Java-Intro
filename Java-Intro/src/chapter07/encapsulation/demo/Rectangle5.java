package chapter07.encapsulation.demo;

public class Rectangle5 {

	private int width = 0;
	private int length = 0;

	// ---------------------------------------------------------------------
	// Konstruktoren
	// ---------------------------------------------------------------------

	// Standard Konstruktor ohne Parameter
	public Rectangle5() {
		this.width = 1; // Alternativ könnte auch der zweite
		this.length = 1; // Konstruktor mit this(1,1) aufgerufen werden
	}

	// Konstruktor mit Breite und Länge
	public Rectangle5(int width, int length) {
		this.width = width;
		this.length = length;
	}

	// Konstruktor mit gleicher Seitengrösse für Länge und Breite (Quadrat)
	public Rectangle5(int size) {
		this(size, size); // Aufruf des anderen Konstruktors
	}

	// ---------------------------------------------------------------------
	// Methoden
	// ---------------------------------------------------------------------

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

	// ---------------------------------------------------------------------
	// Getter und Setter
	// ---------------------------------------------------------------------

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
