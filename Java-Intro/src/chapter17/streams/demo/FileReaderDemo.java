package chapter17.streams.demo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {

		final int EOF = -1; // end of file
		FileReader reader = null;

		try {
			// create reader
			String filename = TestData
					.getAbsoluteFilename("file-reader-demo.txt");

			reader = new FileReader(filename);

			// read until end of file
			StringBuilder text = new StringBuilder();
			int x = reader.read();

			while (x != EOF) {
				// cast integer to char
				char c = (char) x;

				// append character
				text.append(c);

				// read next value
				x = reader.read();
			}

			// print text to console
			System.out.println(text.toString());

		} catch (IOException e) {
			System.out.println("Demo failed with: " + e.toString());

		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (Exception e) {
					// ignore
				}
			}
		}

	}

}
