package com.herdt.java8.kap05;

class ControlDoWhile {
	public static void main(String[] args) {
		double presentValue = 1000.0;
		double futureValue = 10000.0;
		final double INTEREST_RATE = 4.5; // Zinssatz in Prozent
		int year = 0;

		do {
			presentValue = presentValue * (1.0 + INTEREST_RATE / 100);
			// Startwert wird um Zinsen erhoeht
			year++; // Jahr um 1 erhoehen
		} while (presentValue < futureValue); // Das gewuenschte Kapital ist
												// noch nicht erreicht, richtig?

		System.out.printf("Die Dauer betraegt %d Jahre%n", year);
	}
}
