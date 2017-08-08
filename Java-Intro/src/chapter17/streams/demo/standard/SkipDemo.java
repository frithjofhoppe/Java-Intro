package chapter17.streams.demo.standard;

import static java.lang.System.in;
import static java.lang.System.out;

import java.io.IOException;

public class SkipDemo {

	public static void main(String[] args) {

		byte[] b = new byte[1];

		try {
			// Erste Eingabe lesen
			out.print("Bitte geben Sie ein Zeichen ein: ");
			in.read(b);
			out.println((char) b[0] + " hat den ASCII-Code " + b[0]);

			// Weitere Zeichen (inkl. Enter) überspringen
			in.skip(in.available());

			// Zweite Eingabe lesen
			out.print("Bitte geben Sie noch ein Zeichen ein: ");
			in.read(b);
			out.println((char) b[0] + " hat den ASCII-Code " + b[0]);

		} catch (IOException ioex) {
			out.println(ioex.getMessage());
		}
	}

}
