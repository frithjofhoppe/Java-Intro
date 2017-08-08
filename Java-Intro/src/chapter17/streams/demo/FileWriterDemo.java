package chapter17.streams.demo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {

		FileWriter writer = null;

		try {
			String fileName = TestData
					.getAbsoluteFilename("file-writer-demo.txt");
			writer = new FileWriter(fileName);

			writer.write("1. Zeile: Test zur Ausgabe \r\n");
			writer.write("2. Zeile: in eine Datei.");

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
