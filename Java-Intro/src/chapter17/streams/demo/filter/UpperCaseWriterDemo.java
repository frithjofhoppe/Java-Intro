package chapter17.streams.demo.filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class UpperCaseWriterDemo {

	public static void main(String[] args) {
		PrintWriter writer = null;

		try {
			// Eingabe
			System.out.println("Geben Sie bitte einen Texte ein:");

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			String text = reader.readLine();

			// Filter und Ausgabe
			writer = new PrintWriter(new UpperCaseWriter(
					new OutputStreamWriter(System.out)));

			System.out.println("Ausgabe mit UppercaseWriter:");
			writer.println(text);

		} catch (IOException ex) {
			System.out.println(ex.toString());

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
