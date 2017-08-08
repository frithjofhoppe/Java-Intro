package chapter04.language.exercise;

import util.Reader;

public class Rechteck {

	public static void main(String[] arg) {
		int a = Integer.parseInt(arg[0]), b = Integer.parseInt(arg[1]);

		System.out.println("Umfang:" + umfang(a, b) + "\r\nFläche:" + flaeche(a, b));

		
		a = Integer.parseInt(Reader.readln("Erste Zahl"));
	}

	static int umfang(int a, int b) {
		return 2 * a + 2 * b;
	}

	static int flaeche(int a, int b) {
		return a * b;
	}

}
