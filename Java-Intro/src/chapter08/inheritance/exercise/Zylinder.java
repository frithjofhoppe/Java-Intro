package chapter08.inheritance.exercise;

public class Zylinder extends Kreis{
	
	private double height;

	Zylinder()
	{
		
	}
	
	Zylinder(double radius, double height)
	{
		super(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolumen()
	{
		return super.getFlaeche() * height;
	}
	
	public String toString()
	{
		return super.toString() + ", das Volumen: "+getVolumen();
	}
}
