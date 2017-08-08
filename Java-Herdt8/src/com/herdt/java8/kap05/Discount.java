package com.herdt.java8.kap05;

class Discount {
	public static void main(String[] args) {
		double invoiceAmount = 0.0; // Rechnungsbetrag

		invoiceAmount = Double.parseDouble(args[0]); // Programmparameter als
														// Fliess-
														// kommazahl auswerten
														// und
														// in invoiceAmount
														// speichern
		if (invoiceAmount > 1000) {
			invoiceAmount -= invoiceAmount * 0.04; // Rabatt wird berechnet und
													// vom
													// Rechnungsbetrag abgezogen
													// auch moeglich:
													// invoiceAmount *= 0.96;
			System.out.println("Es wurde ein Rabatt gewaehrt");
		}
		System.out.printf("Ihr Gesamtbetrag betraegt %g%n", invoiceAmount);
	}
}
