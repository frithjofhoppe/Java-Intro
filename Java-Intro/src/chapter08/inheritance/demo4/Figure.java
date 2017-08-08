package chapter08.inheritance.demo4;

public abstract class Figure {

	protected int posX;
	protected int posY;
	protected boolean visible;

	public Figure() {
		super();
	}

	public Figure(int posX, int posY, boolean visible) {
		this.posX = posX;
		this.posY = posY;
		this.visible = visible;
	}

	// Abstrakte Methode muss von Subklassen implementiert werden
	public abstract void move();

}
