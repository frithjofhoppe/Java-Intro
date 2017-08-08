package chapter08.inheritance.demo3;

public class Artikel {

	private int nr;
	private double preis;

	public Artikel() {
		super();
	}

	public Artikel(int nr, double preis) {
		this.nr = nr;
		this.preis = preis;
	}

	@Override
	public Artikel clone() {
		return new Artikel(this.nr, this.preis);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikel other = (Artikel) obj;
		if (nr != other.nr)
			return false;
		if (Double.doubleToLongBits(preis) != Double
				.doubleToLongBits(other.preis))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artikel Nr " + this.nr + " hat den Preis " + this.preis;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

}
