package chapter07.encapsulation.exercise;

public class Kreis2 {
	
	double radius;
	boolean sichtbar;
	
	Kreis2(double radius, boolean sichtbar)
	{
		this.radius = radius;
		this.sichtbar = sichtbar;
	}
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public boolean isSichtbar() {
		return sichtbar;
	}

	public void setSichtbar(boolean sichtbar) {
		this.sichtbar = sichtbar;
	}

	public double getUmfang()
	{
		return 2 * Math.PI * radius;
	}
	
	public double getFlaeche()
	{
		return Math.PI * radius * radius;
	}
	
	public void print()
	{
		System.out.printf("Kreis mit Radius %g und sichbar = "+sichtbar+" \n",radius);
		System.out.printf("- Umfang = %g\n",getUmfang());
		System.out.printf("- Fläche = %g\n",getFlaeche());
	}
}
