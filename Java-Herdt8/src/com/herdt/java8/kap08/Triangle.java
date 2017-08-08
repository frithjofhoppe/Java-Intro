package com.herdt.java8.kap08;

class Triangle extends Shape {
	private double base;
	private double altitude;

	void setBase(double base) {
		this.base = base;
	}

	double getBase() {
		return base;
	}

	void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	double getAltitude() {
		return altitude;
	}

	double getArea() {
		return getBase() * getAltitude() / 2;
	}
}
