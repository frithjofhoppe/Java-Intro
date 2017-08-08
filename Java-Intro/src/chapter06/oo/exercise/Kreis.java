package chapter06.oo.exercise;

public class Kreis {
	
	double radius;
	
	Kreis(double radius)
	{
		this.radius = radius;
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
		System.out.printf("Kreis mit Radius %g\n",radius);
		System.out.printf("- Umfang = %g\n",getUmfang());
		System.out.printf("- Fläche = %g\n",getFlaeche());
	}
}
