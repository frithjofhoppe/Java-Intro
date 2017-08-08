package chapter17.streams.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {

		BufferedReader reader = null;

		try {
			// create reader
			String filename = TestData
					.getAbsoluteFilename("buffered-reader-demo.txt");

			reader = new BufferedReader(new FileReader(filename));

			// read lines
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}

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
