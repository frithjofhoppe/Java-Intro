package chapter11.demo;

public class StringMethodDemo {

	public static void main(String[] args) {

		String text = "abc...xyz";

		System.out.println(text);
		System.out.println("Länge = " + text.length());

		System.out.println("Index von xyz = " + text.indexOf("xyz"));
		System.out.println("Substring (6) = " + text.substring(6));

		// trim
		String eingabe = "   Hello World  ";
		System.out.println("<" + eingabe + ">");
		System.out.println("<" + eingabe.trim() + ">");

		// substring
		String datum = "1.1.2011";
		int startPosJahr = datum.lastIndexOf('.');

		System.out.println("Datum = " + datum);
		System.out.println("Start Pos Jahr = " + startPosJahr);

		String jahr = datum.substring(startPosJahr + 1);
		System.out.println("Jahr = " + jahr);

		datum = "31.12.2011";
		startPosJahr = datum.lastIndexOf('.');

		System.out.println("Datum = " + datum);
		System.out.println("Start Pos Jahr = " + startPosJahr);

		jahr = datum.substring(startPosJahr + 1);
		System.out.println("Jahr = " + jahr);
	}

}
