package chapter06.oo.exercise;

public class Mitarbeiter extends Person{

	private double lohn;
	
	Mitarbeiter(String vorname, String nachname,double lohn) {
		super(vorname, nachname);
		this.lohn = lohn;
	}
	
	public String getNames()
	{
		return super.getNames() + " " +this.getLohn();
	}

	public double getLohn() {
		return lohn;
	}

	public void setLohn(double lohn) {
		this.lohn = lohn;
	}

}
