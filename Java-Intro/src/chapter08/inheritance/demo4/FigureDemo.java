package chapter08.inheritance.demo4;

public class FigureDemo {

	public static void main(String[] args) {

		Circle circle = new Circle(3, 7, true, 12);
		Rectangle rectangle = new Rectangle(15, 25, true, 10, 5);

		circle.move();
		rectangle.move();
	}

}
