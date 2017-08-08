package chapter07.encapsulation.demo;

public class Rectangle4 {

	private int width = 0; // Attribut mit den Modifier private
	private int length = 0; // sind nur innerhalb der Klasse sichtbar

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
