package chapter13.collections.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Bauernhof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> liste = new ArrayList<String>();
		String tiere = "Kuh, Ziege, Huhn, Katze, Hund, Schaf, Schwein";
		liste.add("Kuh");
		liste.add("Ziege");
		liste.add("Huhn");
		liste.add("Kazte");
		liste.add("Hund");
		liste.add("Schaf");
		liste.add("Schwein");
		
		Iterator<String> iter = liste.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		Collections.sort(liste);
		
		System.out.println("\nSortierteListe:");
		
		iter = liste.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		System.out.println("\nRückwärtsSortierteListe:");
		
		Collections.reverse(liste);
		
		iter = liste.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}
