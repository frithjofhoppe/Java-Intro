package com.herdt.java8.kap06;

class UseStatic {
	public static void main(String[] args) {
		System.out.printf("Druckeraufloesung: %d dpi%n", StaticElements.DotsPerInch);

		double inputValue = Double.parseDouble(args[0]);
		double result = StaticElements.calcSquare(inputValue);
		System.out.printf("Das Quadrat von %g ist %g%n", inputValue, result);
	}
}
