package chapter13.collections.demo.lists;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String args[]) {

		List<String> messages = new Vector<String>();

		messages.add("Kuchen");
		messages.add(null); // null Referenz
		messages.add("Pizza");
		messages.add("Kuchen"); // Duplikat
		messages.add("Salat");

		for (String message : messages) {
			System.out.println(message);
		}
	}

}
