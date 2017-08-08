package com.herdt.java8.kap05;

class Discount2 {
	public static void main(String[] args) {
		double invoiceAmount = 0.0; // Rechnungsbetrag

		final double DISCOUNT_RATE = 0.05; // Rabatt: als Konstante

		double discountAmount = 0.0; // Rabattbetrag
		invoiceAmount = Double.parseDouble(args[0]); // Programmparameter als
														// Fliess-
														// kommazahl auswerten
														// und
														// in invoiceAmount
														// speichern
		if (invoiceAmount > 1000) {
			discountAmount = invoiceAmount * DISCOUNT_RATE;
			System.out.printf("Sie erhalten einen Rabatt von %g%n", discountAmount);
		} else {
			System.out.println("Bei Werten ueber 1000 erhalten Sie Rabatt!");
		}
	}
}
