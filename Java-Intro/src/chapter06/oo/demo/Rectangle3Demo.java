package chapter06.oo.demo;

public class Rectangle3Demo {

	public static void main(String[] args) {

		Rectangle3 rectA = new Rectangle3();
		rectA.length = 10;
		rectA.width = 5;

		Rectangle3 rectB = new Rectangle3();
		rectB.length = 10;
		rectB.width = 5;

		System.out.println("Rechteck A mit Länge " + rectA.length
				+ " und Breite " + rectA.width + " und Id " + rectA);

		System.out.println("Rechteck B mit Länge " + rectB.length
				+ " und Breite " + rectB.width + " und Id " + rectB);

	}
}
