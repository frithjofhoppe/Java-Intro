package chapter05.flowctrl.exercise;

import java.io.Console;
import java.io.IOException;

import util.Reader;

public class Note {

	public static void main(String[] args) throws IOException {

		boolean running = true;
		String input = "";

		while (running) {
			input = Reader.readln("Geben sie ihre Note ein: ");
			boolean isNumber = false;

			for (int i = 0; i < input.length(); i++) {
				if (Character.isDigit(input.charAt(i))) {
					isNumber = true;
				} else {
					isNumber = false;
				}
			}

			if (isNumber) {
				int note = Integer.parseInt(input);
				String bewertung = "";

				if (note >= 4 && note <= 6) {
					switch (note) {
					case 4:
						bewertung = "genügend";
						break;
					case 5:
						bewertung = "gut";
						break;
					case 6:
						bewertung = "she gut";
						break;
					default:
						break;
					}

					System.out.println("Sie haben den Test mit der Bewertung " + bewertung + " erreicht");

				} else if (note <= 4 && note >= 1) {
					System.out.println("Der Test wurde nicht bestanden");
				}

			} else {
				System.out.println("Eingabe war keine Zahl");
			}

		}

		input = "";
	}

}
