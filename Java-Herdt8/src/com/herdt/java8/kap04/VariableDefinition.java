package com.herdt.java8.kap04;

class VariableDefinition {
	public static void main(String[] args) {
		// --richtige Definition --------
		int number; // definiert eine Variable number vom Typ int (Integer)
		double price, size; // definiert zwei Variablen vom Typ double
		char c; // definiert eine Variable c vom Typ char (Character)

		// --fehlerhafte Definition --------
		// int &count; //Bezeichner von Variablen duerfen kein & enthalten
		// double a b c; //mehrere Variablen muessen durch Kommata getrennt sein
	}
}
