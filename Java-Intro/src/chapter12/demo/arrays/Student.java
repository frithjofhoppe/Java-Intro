package chapter12.demo.arrays;

public class Student {
	private String name;
	private String fach;

	public Student() {
		super();
	}

	public Student(String name, String fach) {
		this.name = name;
		this.fach = fach;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return this.name + ", " + this.fach;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFach() {
		return fach;
	}

	public void setFach(String fach) {
		this.fach = fach;
	}

}
