package chapter06.oo.demo;

public class Rectangle2Demo {

	public static void main(String[] args) {

		Rectangle2 rect = new Rectangle2();
		rect.width = 5;
		rect.length = 8;

		System.out.println("Rechteck vor swap mit L�nge " + rect.length
				+ " und Breite " + rect.width);

		rect.swapWidthLength();

		System.out.println("Rechteck nach swap mit L�nge " + rect.length
				+ " und Breite " + rect.width);
	}

}
