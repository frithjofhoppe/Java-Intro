package chapter08.inheritance.exercise;

public class FahrzeugDemo {

	public static void main(String[] arg)
	{
	
	PKW p1 = new PKW("Blau","2000",56);
	Fahrrad f1 = new Fahrrad("Gelb","2016","Pegasus");
	
	System.out.println(p1.toString());

	System.out.println(f1.toString());
	}

}
