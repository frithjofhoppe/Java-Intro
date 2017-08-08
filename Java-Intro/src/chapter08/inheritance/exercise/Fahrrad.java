package chapter08.inheritance.exercise;

public class Fahrrad extends Fahrzeug{

	private String marke;
	
	Fahrrad(String color, String baujahr,String marke)
	{
		super(color,baujahr);
		this.marke = marke;
	}
	
	public String fahren()
	{
		return "Fahrrad "+super.fahren();
	}
	
	public String toString()
	{
		return super.toString() + "/r Marke:"+getMarke();
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}
	
}
