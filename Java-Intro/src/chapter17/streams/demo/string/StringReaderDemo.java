package chapter17.streams.demo.string;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderDemo {

	public static void main(String[] args) {
		final int EOF = -1;
		String string = "Java macht Spass!";

		StringReader reader = new StringReader(string);

		try {
			int c = reader.read();

			while (c != EOF) {
				System.out.print((char) c);
				c = reader.read();
			}
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}

}
