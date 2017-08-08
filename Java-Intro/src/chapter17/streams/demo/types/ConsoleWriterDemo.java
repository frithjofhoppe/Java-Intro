package chapter17.streams.demo.types;

import static java.lang.Math.PI;

import java.io.PrintWriter;

public class ConsoleWriterDemo {

	public static void main(String[] args) {

		PrintWriter writer = null;

		try {
			// Konsolen Ausgabe
			// mit Hilfe eines PrintWriter und dem System.out OutputStream
			writer = new PrintWriter(System.out);

			writer.println("Ausgabe des Flächeninhalts für Kreise:");

			for (int r = 1; r <= 10; r++) {
				writer.print("Radius r = " + r + ": ");
				writer.println(PI * r * r);
			}

		} catch (Exception e) {
			System.out.println("Demo failed with: " + e.toString());

		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (Exception e) {
					// ignore
				}
			}
		}

	}

}
