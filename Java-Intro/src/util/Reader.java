package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hilfsklasse zum einlesen von verschiedenen Datentypen via Konsole.
 */
public class Reader {

	public static String readln() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			return reader.readLine();
		} catch (IOException e) {
			System.out.println("Fehler beim einlesen " + e.getMessage());
			return null;
		}
	}

	public static String readln(String prompt) {
		System.out.print(prompt);
		return readln();
	}

	public static int readInt() {
		String line = readln();
		return Integer.parseInt(line.trim());
	}

	public static int readInt(String prompt) {
		System.out.print(prompt);
		return readInt();
	}

	public static double readDouble() {
		String line = readln();
		return Double.parseDouble(line.trim());
	}

	public static double readDouble(String prompt) throws IOException {
		System.out.print(prompt);
		return readDouble();
	}

} // end
