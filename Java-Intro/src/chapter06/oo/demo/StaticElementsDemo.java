package chapter06.oo.demo;

public class StaticElementsDemo {

	public static void main(String[] args) {

		System.out.printf("Die Druckeraufloesung ist %d dpi %n",
				StaticElements.DotsPerInch);

		double value = 5.0;
		double result = StaticElements.calcSquare(value);
		System.out.printf("Das Quadrat von %g ist %g %n", value, result);
	}

}
