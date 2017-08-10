package chapter15.assertions.demo;

import chapter15.assertions.demo.SQLproblem.Category;


class AssertionDemo {

	@SQLproblem(category=Category.LOW)
	public static void setRoomTemp(double temp) {

		// Soll Temperatur auf "normalen Bereich" prüfen
		assert temp > 17.0 : "Die Raumtemperatur ist mit " + temp
				+ " Grad zu niedrig.";

		assert temp < 22.0 : "Die Raumtemperatur ist mit " + temp
				+ " Grad zu hoch.";

		// Heizung steueren
		System.out.println("Die Solltemparatur wird auf " + temp
				+ " Grad eingestellt.");
	}

	
	public static void main(String args[]) {

		setRoomTemp(21.0);

		try {
			setRoomTemp(16.5);
		} catch (AssertionError e) {
			System.out.println(e.toString());
		}

		try {
			setRoomTemp(25.7);
		} catch (AssertionError e) {
			System.out.println(e.toString());
		}

	}
}
