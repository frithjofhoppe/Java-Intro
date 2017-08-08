package chapter10.interfaces.demo;


/**
 * Die Klasse Rectangle implementiert das Interface Form.
 */
public class Rectangle implements Form {

	private double width = 1.0;
	private double length = 1.0;

	// -----------------------------------------------------------------------
	// Konstruktoren
	// -----------------------------------------------------------------------

	public Rectangle() {
		super();
	}

	public Rectangle(double size) {
		this(size, size);
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	// -----------------------------------------------------------------------
	// Implementation Interface Methoden
	// -----------------------------------------------------------------------

	@Override
	public double getArea() {
		return getWidth() * getLength();
	}

	@Override
	public double getPerimeter() {
		return 2.0 * (getWidth() + getLength());
	}

	// -----------------------------------------------------------------------
	// Getter und Setter
	// -----------------------------------------------------------------------

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

}