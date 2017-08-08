package chapter09.packages.demo.figures;

public class Rectangle extends Figure {

	protected int length;
	protected int width;

	public Rectangle() {
		super();
	}

	public Rectangle(int posX, int posY, boolean visible, int length, int width) {
		super(posX, posY, visible);
		this.length = length;
		this.width = width;
	}

	@Override
	public void move() {
		System.out.println("move rectangle");
	}

}