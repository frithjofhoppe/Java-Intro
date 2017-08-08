package com.herdt.java8.kap08;

abstract class Shape {
	private boolean filled = false;

	boolean isFilled() {
		return filled;
	}

	void setFilled(boolean filled) {
		this.filled = filled;
	}

	abstract double getArea();
}
