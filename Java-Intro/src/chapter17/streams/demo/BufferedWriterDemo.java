package chapter17.streams.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {

		BufferedWriter writer = null;

		try {
			String fileName = TestData
					.getAbsoluteFilename("buffered-writer-demo.txt");
			writer = new BufferedWriter(new FileWriter(fileName));

			for (int i = 0; i < 100; i++) {
				writer.write("Buffered Writer Demo");
				writer.newLine();
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
