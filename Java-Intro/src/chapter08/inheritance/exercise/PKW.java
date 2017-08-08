package chapter08.inheritance.exercise;

public class PKW extends Fahrzeug{
	
	private double sitzplaetze;
	

	PKW(String color,String baujahr,double sitzplaetze)
	{
		super(color,baujahr);
		this.sitzplaetze = sitzplaetze;
	}

	public String fahren()
	{
		return "PKW "+super.fahren();
	}
	
	public String toString()
	{
		return super.toString() + "/r Sitzplätze:"+getSitzplaetze();
	}
	
	public double getSitzplaetze() {
		return sitzplaetze;
	}

	public void setSitzplaetze(double sitzplaetze) {
		this.sitzplaetze = sitzplaetze;
	}

}
