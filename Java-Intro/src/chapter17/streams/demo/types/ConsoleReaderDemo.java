package chapter17.streams.demo.types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReaderDemo {

	public static String readString() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		return reader.readLine();
	}

	public static int readInt() throws NumberFormatException, IOException {
		return Integer.parseInt(readString());
	}

	public static double readDouble() throws NumberFormatException, IOException {
		return Double.parseDouble(readString());
	}

	public static void main(String[] args) {

		try {

			System.out.println("String = ");
			String s = readString();

			System.out.println("int = ");
			int i = readInt();

			System.out.println("double = ");
			double d = readDouble();

		} catch (Exception e) {
			System.out.println("Demo failed with: " + e.toString());
		}
	}
}
