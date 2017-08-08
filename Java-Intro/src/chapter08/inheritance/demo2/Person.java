package chapter08.inheritance.demo2;

public class Person {

	private String name;
	private int jahrgang;

	public Person() {
	}

	public Person(String name, int jahrgang) {
		this.name = name;
		this.jahrgang = jahrgang;
	}

	public String toString() {
		return this.name + " hat Jahrgang " + this.jahrgang;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getJahrgang() {
		return jahrgang;
	}

	public void setJahrgang(int jahrgang) {
		this.jahrgang = jahrgang;
	}

}
