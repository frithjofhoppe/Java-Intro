package chapter03.helloworld.demo;

import java.util.Date;

public class HelloWorld {

	/**
	 * Mein erstes Java Programm.
	 */
	public static void main(String[] args) {

		// step 1
		System.out.println("Hello World 1");

		// step 2
		String meinText = "Hello World 2";
		System.out.println(meinText);

		// step 3
		String prefix = "Hello World 3, heute ist ";
		String postfix = " Uhr.";
		Date date = new Date();

		String meinDritterText = prefix + date + postfix;
		System.out.println(meinDritterText);

		// step 4
		String mein4Text = "Hello World 4, heute ist %s Uhr";
		Date date2 = new Date();

		System.out.printf(mein4Text, date2);
	}
}
