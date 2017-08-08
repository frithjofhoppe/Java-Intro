package chapter13.collections.demo.sets;

public class Person {
	protected int nr;
	protected String firstname;
	protected String lastname;

	public Person() {
		super();
	}

	public Person(int nr, String firstname, String lastname) {
		this.nr = nr;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(this.firstname);
		sb.append(" ");
		sb.append(this.lastname);
		sb.append(" (HashCode=");
		sb.append(this.hashCode());
		sb.append(")");

		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result
				+ ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + nr;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (nr != other.nr)
			return false;
		return true;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
