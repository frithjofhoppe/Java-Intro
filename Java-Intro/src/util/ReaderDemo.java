package util;

import java.io.IOException;

public class ReaderDemo {

	/**
	 * Demo Programm für die Reader Hilfsklasse.
	 */
	public static void main(String[] args) throws IOException {

		System.out.println("Reader Demo:");

		String input = Reader.readln("String = ");
		System.out.println(input);

		int x = Reader.readInt("int = ");
		System.out.println(x);

		double y = Reader.readDouble("double = ");
		System.out.println(y);
	}

}
