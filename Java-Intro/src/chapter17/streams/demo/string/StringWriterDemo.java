package chapter17.streams.demo.string;

import java.io.StringWriter;

public class StringWriterDemo {

	public static void main(String[] args) {

		StringWriter writer = new StringWriter();

		writer.write("Hello");
		writer.append(" ");
		writer.append("String");
		writer.append("Writer");
		writer.append("!\n");

		System.out.println(writer.toString());
	}

}
