package com.herdt.java8.kap08;

class Circle extends Shape {
	private double radius;

	void setRadius(double radius) {
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	double getArea() {
		return 3.14159 * getRadius() * getRadius();
	}
}
