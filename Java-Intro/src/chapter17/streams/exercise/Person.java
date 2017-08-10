package chapter17.streams.exercise;

public class Person
{
	String vorname;
	String nachname;
	String jahrgang;
	
	Person(String vorname,String nachname,String jahrgang)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.jahrgang = jahrgang;
	}
	
	public String toString()
	{
		return this.getVorname() + " " +this.getNachname() + ", "+this.getJahrgang();
	}

	public String getVorname()
	{
		return vorname;
	}

	public String getNachname()
	{
		return nachname;
	}

	public String getJahrgang()
	{
		return jahrgang;
	}
	
	
}
