package chapter06.oo.exercise;

public class PersonDemo {
	public static void main(String[] arg) {
		Person p1 = new Person("Ueli", "Maurer");
		System.out.println(p1.getNames());

		Mitarbeiter m1 = new Mitarbeiter("Hans", "Wurst", 5000);
		System.out.println(m1.getNames());

		Kunde k1 = new Kunde("Donald", "Trump", true);
		k1.setVip(false);
		System.out.println(k1.getNames());

		Person[] personList = { p1, m1, k1 };
		
		for(Person p: personList)
		{
			System.out.println(p.getNames());
		}
		
}}
