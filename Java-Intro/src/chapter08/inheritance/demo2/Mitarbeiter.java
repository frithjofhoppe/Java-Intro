package chapter08.inheritance.demo2;

public class Mitarbeiter extends Person {

	private int lohn;

	public Mitarbeiter() {
		super();
	}

	public Mitarbeiter(String name, int jahrgang, int lohn) {
		super(name, jahrgang);
		this.lohn = lohn;
	}

	public String toString() {
		return super.toString() + " mit Lohn " + this.lohn;
	}

	public int getLohn() {
		return lohn;
	}

	public void setLohn(int lohn) {
		this.lohn = lohn;
	}

}
