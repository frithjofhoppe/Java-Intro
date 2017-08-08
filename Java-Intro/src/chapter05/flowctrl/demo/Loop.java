package chapter05.flowctrl.demo;

import java.io.IOException;

import util.Reader;

public class Loop {

	/**
	 * Beispiel zu Schleifen.
	 */
	public static void main(String[] args) throws IOException {

		// for (Zählergesteuerte Schleife)
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// while (Kopfgesteuerte Schleife)
		int z = 5;

		while (z > 0) {
			System.out.println(z);
			z--;
		}

		// do (Fussgesteuerte Schleife)
		int y;
		do {
			y = Reader.readInt("y=");
			System.out.println(y);
		} while (y >= 0);

		// break (Abbruch Schleife)
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 5) {
				// schlaufe wird verlassen
				break;
			}
		}

		// continue (Weiterfahren mit nächsten Lauf der Schleife)
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// restliche Anweisungen werden übersprungen
				continue;
			}
			System.out.println(i);
		}
	}
}
