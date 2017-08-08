package chapter08.inheritance.demo1;

class Cuboid extends Rectangle {

	private int height;

	// ---------------------------------------------------------------------
	// Konstruktoren
	// ---------------------------------------------------------------------

	Cuboid() {
		System.out.println("Cuboid - Standard Konstruktor ohne Parameter");
		// automatischer Aufruf des Standard Konstruktor von Rectangle
		this.height = 1;
	}

	Cuboid(int width, int length, int height) {
		super(width, length); // Konstruktor der Superklasse wird aufgerufen
		this.height = height;
	}

	// ---------------------------------------------------------------------
	// Methoden
	// ---------------------------------------------------------------------

	int getBase() {
		return super.getArea();
	}

	public int getVolume() {
		return this.getArea() * this.height;
	}

	// Überschreiben der Methode getArea der Klasse Rectangle
	int getArea() {

		int lxw = super.getArea(); // length x witdh (via Methode der
									// Basisklasse
		int lxh = this.getLength() * this.getHeight(); // length x height
		int wxh = this.getWidth() * this.getHeight(); // witdh x height

		return 2 * (lxw + lxh + wxh);
	}

	// ---------------------------------------------------------------------
	// Getter und Setter
	// ---------------------------------------------------------------------

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}
}
