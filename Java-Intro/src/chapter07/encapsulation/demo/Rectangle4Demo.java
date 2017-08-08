package chapter07.encapsulation.demo;

public class Rectangle4Demo {

	public static void main(String[] args) {

		// Erstellung Objekt via Standard Konstruktor
		Rectangle4 rect = new Rectangle4();

		// Attribute setzen via Setter
		rect.setLength(10);
		rect.setWidth(5);

		// Attribute lesen via Getter
		System.out.println("Rechteck mit Länge " + rect.getLength()
				+ " und Breite " + rect.getWidth());

	}
}
