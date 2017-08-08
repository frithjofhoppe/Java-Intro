package chapter17.streams.demo.types;

import static java.lang.Math.PI;

import java.io.IOException;
import java.io.PrintWriter;

import chapter17.streams.demo.TestData;

public class PrintWriterDemo {

	public static void main(String[] args) {

		PrintWriter writer = null;

		try {
			String fileName = TestData
					.getAbsoluteFilename("print-writer-demo.txt");

			writer = new PrintWriter(fileName);

			// String schreiben
			writer.println("Ausgabe des Flächeninhalts für Kreise:");

			for (int r = 1; r <= 10; r++) {
				// String schreiben
				writer.print("Radius r = " + r + ": ");
				// double-Wert schreiben
				writer.println(PI * r * r);
			}

		} catch (IOException e) {
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
