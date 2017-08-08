package chapter06.oo.demo;

public class Rectangle1Demo {

	public static void main(String[] args) {

		// Instanz rect von Klasse Rectangel erzeugen
		Rectangle1 rect = new Rectangle1();

		// Attribute setzen
		rect.length = 10;
		rect.width = 5;

		// Attribute lesen und ausgeben
		System.out.println("Rechteck mit Länge " + rect.length + " und Breite "
				+ rect.width);
	}
}
