package chapter08.inheritance.exercise;

public class Fahrzeug {

	private String color;
	private String baujahr; 
	
	Fahrzeug(String color, String baujahr)
	{
		this.color = color;
		this.baujahr = baujahr;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(String baujahr) {
		this.baujahr = baujahr;
	}

	public String toString()
	{
		return "Farbe: "+color+"/r, Baujahr:"+baujahr;
	}
	
	public String fahren()
	{
		return "fährt...";
	}

}
