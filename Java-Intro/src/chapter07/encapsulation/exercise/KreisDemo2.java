package chapter07.encapsulation.exercise;

import java.util.ArrayList;

public class KreisDemo2 {

	public static void main(String[] args) {

		ArrayList<Kreis2> kreisListe = new ArrayList<Kreis2>();
		
		kreisListe.add(new Kreis2(3.0,true));
		kreisListe.add(new Kreis2(8.7,false));
		kreisListe.add(new Kreis2(5.5,true));
		
		for(Kreis2 k:kreisListe)
		{
			k.print();
		}
		
	}

}
