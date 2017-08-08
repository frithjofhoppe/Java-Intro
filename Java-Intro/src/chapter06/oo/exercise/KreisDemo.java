package chapter06.oo.exercise;

import java.util.ArrayList;

public class KreisDemo {

	public static void main(String[] args) {

		ArrayList<Kreis> kreisListe = new ArrayList<Kreis>();
		
		kreisListe.add(new Kreis(3.0));
		kreisListe.add(new Kreis(8.7));
		kreisListe.add(new Kreis(5.5));
		
		for(Kreis k:kreisListe)
		{
			k.print();
		}
		
	}

}
