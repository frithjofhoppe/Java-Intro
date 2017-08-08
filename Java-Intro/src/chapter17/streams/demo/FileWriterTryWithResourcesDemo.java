package chapter17.streams.demo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTryWithResourcesDemo {

	public static void main(String[] args) {

		String fileName = TestData.getAbsoluteFilename("file-writer-demo.txt");

		// try with resources, the writer will be automatically closed at the end
		try (FileWriter writer = new FileWriter(fileName)) {

			writer.write("1. Zeile: Test zur Ausgabe \r\n");
			writer.write("2. Zeile: in eine Datei.");

		} catch (IOException e) {
			System.out.println("Demo failed with: " + e.toString());
		}

	}

}
