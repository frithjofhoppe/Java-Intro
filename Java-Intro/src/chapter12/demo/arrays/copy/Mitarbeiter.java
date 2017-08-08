package chapter12.demo.arrays.copy;

public class Mitarbeiter {

	private int nr;
	private String name;

	public Mitarbeiter() {
		super();
	}

	public Mitarbeiter(int nr, String name) {
		this.nr = nr;
		this.name = name;
	}

	public String toString() {
		return this.nr + ", " + this.name;
	}

	public Mitarbeiter clone() {
		Mitarbeiter result = new Mitarbeiter();
		result.nr = this.nr;
		result.name = new String(this.name);
		return result;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
