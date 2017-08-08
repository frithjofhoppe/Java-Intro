package chapter19.lambda.demo;

public class ConverterDemo {

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

	private static void calculate(double[] values, Converter converter) {
		for (double value : values) {
			System.out.println(value + " = " + converter.convert(value));
		}
	}

} // end