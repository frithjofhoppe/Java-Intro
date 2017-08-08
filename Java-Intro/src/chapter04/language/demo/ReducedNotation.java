package chapter04.language.demo;

public class ReducedNotation {

	/**
	 * Beispiele reduzierte Notation und Rangfolge.
	 */
	public static void main(String[] args) {

		int x = 5;
		int y = 3;

		// increment
		x = x + 1;
		x++;

		// decrement
		x = x - 1;
		x--;

		// increment mit x und y
		x = x + y;
		x += y;

		// decrement mit x und y
		x = x - y;
		x -= y;

		// rangfolge (precedence)
		int res = ((x * 5) + y) / 2;

	}

}
