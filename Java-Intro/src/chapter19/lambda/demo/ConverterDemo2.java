package chapter19.lambda.demo;

import java.util.function.Function;

public class ConverterDemo2 {

	public static void main(String[] args) {

		// Temparaturen in Grad Celsius
		double[] celsius = { 18, 19, 20, 21, 22, 23 };

		// K = C + 273.15
		System.out.println("Grad Celsius in Kelvin:");
		calculate(celsius, input -> input + 273.15);

		// F = C x 1.8 + 32
		System.out.println("Grad Celsius in Fahrenheit:");
		calculate(celsius, input -> (input * 1.8) + 32);

	}

	private static void calculate(double[] values, Function<Double, Double> converter) {
		for (double value : values) {
			System.out.println(value + " = " + converter.apply(value));
		}
	}

} // end