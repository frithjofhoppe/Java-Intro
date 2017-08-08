package chapter07.encapsulation.demo;

public class Rectangle5Demo {

	public static void main(String[] args) {
		// Ein Rechteck mit der Breite 1 und der Laenge 1 erzeugen
		Rectangle5 specialRect = new Rectangle5();

		// Ein Rechteck mit der Breite 3 und der Laenge 5 erzeugen
		Rectangle5 anotherRect = new Rectangle5(3, 5);

		System.out.printf("Das Rechteck (%d x %d)%n", specialRect.getWidth(),
				specialRect.getLength());

		System.out.printf("hat den Flaecheninhalt %d%n", specialRect.getArea());

		System.out.println();

		System.out.printf("Das Rechteck (%d x %d)%n", anotherRect.getWidth(),
				anotherRect.getLength());

		System.out.printf("hat den Flaecheninhalt %d%n", anotherRect.getArea());
	}

}
