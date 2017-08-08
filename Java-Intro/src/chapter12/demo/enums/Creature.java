package chapter12.demo.enums;

public enum Creature {

	// Definition Werte mit Aufruf des Konstruktors
	SNAKE(0), LIZARD(4), FISH(0), SPIDER(8), INSECT(6);

	// Attribut
	private int legs;

	// Konstruktor
	Creature(int legs) {
		this.legs = legs;
	}

	// Methoden
	public int getLegs() {
		return legs;
	}

	public String getDescription() {
		String s = this.toString() + "s have ";
		if (getLegs() > 0) {
			s = s + getLegs();
		} else {
			s = s + "no";
		}
		return s + " legs.";
	}
}
