package chapter09.packages.demo;

// import von rectangle
import chapter09.packages.demo.figures.Rectangle;

public class FigureDemo {

	public static void main(String[] args) {

		// Verwendung voll qualifizierter Klassenname (ohne Import)
		chapter09.packages.demo.figures.Circle circle = new chapter09.packages.demo.figures.Circle(
				3, 7, true, 12);

		// Verwendung unqualifizierter Klassenname (benötigt Import)
		Rectangle rectangle = new Rectangle(15, 25, true, 10, 5);

		circle.move();
		rectangle.move();
	}

}
