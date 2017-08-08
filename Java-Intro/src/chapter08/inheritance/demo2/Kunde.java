package chapter08.inheritance.demo2;

public class Kunde extends Person {

	private int kundenNr;

	public Kunde() {
		super();
	}

	public Kunde(String name, int jahrgang, int kundenNr) {
		super(name, jahrgang);
		this.kundenNr = kundenNr;
	}

	public String toString() {
		return super.toString() + " mit KundenNr " + this.kundenNr;
	}

	public int getKundenNr() {
		return kundenNr;
	}

	public void setKundenNr(int kundenNr) {
		this.kundenNr = kundenNr;
	}

}
