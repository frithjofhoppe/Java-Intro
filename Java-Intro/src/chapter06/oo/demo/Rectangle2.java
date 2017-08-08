package chapter06.oo.demo;

public class Rectangle2 {
	int width = 0;
	int length = 0;

	// einfache Methode
	void swapWidthLength() {
		int temp = width; // lokale Variable
		width = length;
		length = temp;
	}

	// Methode mit einem Parameter
	void buildSquare(int sideLength) {
		width = sideLength;
		length = sideLength;
	}

	// Methode mit Parameter und ohne Rueckgabewert
	int getArea() {
		return width * length;
	}

	// Methode ueberladen
	void resize(int newWidth, int newLength) {
		width = newWidth;
		length = newLength;
	}

	void resize(double factor) {
		width = (int) (width * factor);
		length = (int) (length * factor);
	}
}
