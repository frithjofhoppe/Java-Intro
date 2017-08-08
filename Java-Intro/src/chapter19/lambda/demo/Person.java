package chapter19.lambda.demo;

/**
 * Lambda Expression Demo.
 */
public class Person {

	private String firstname;
	private String lastname;

	public Person() {
	}

	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return firstname + " " + lastname;
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
