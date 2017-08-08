package chapter04.language.demo;

public class ParamConversion {

	/**
	 * Beispiel für die Konvertierung von Programm Parametern.
	 */
	public static void main(String[] args) {

		// check params
		if (args.length != 2) {
			System.out
					.println("Bitte übergeben Sie dem Programm zwei Ganzzahl Parameter (min / max).");
			System.exit(-1);
		}

		// read and convert params
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);

		System.out.printf("Parameter min=%d, max=%d", min, max);
		System.exit(0);
	}
}
