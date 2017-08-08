package chapter10.interfaces.demo;

import static java.lang.Math.PI;

public class Circle implements Form {

	private double radius = 1.0;

	// -----------------------------------------------------------------------
	// Konstruktoren
	// -----------------------------------------------------------------------

	public Circle() {
		super();
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	// -----------------------------------------------------------------------
	// Implementation Interface Methoden
	// -----------------------------------------------------------------------

	@Override
	public double getArea() {
		return PI * getRadius() * getRadius();
	}

	@Override
	public double getPerimeter() {
		return 2.0 * PI * getRadius();
	}

	// -----------------------------------------------------------------------
	// Getter und Setter
	// -----------------------------------------------------------------------

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}