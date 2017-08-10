package chapter13.collections.exercise;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import chapter13.collections.demo.sets.Person;

public class BuchDemo {

	public static void main(String[] args) {

		Set<Buch> buchListe = new LinkedHashSet<Buch>();
		Set<Buch> sortedBuchListe = new TreeSet<Buch>();
		
		buchListe.add(new Buch("Effi Birset","Fontane",10000));
		buchListe.add(new Buch("Der Untertan","Mann",15000));
		buchListe.add(new Buch("Faust I","Goethe",20000));
		buchListe.add(new Buch("Faust II","Goethe",20000));
		buchListe.add(new Buch("Wilhelm Tell","Schiller",10000));
		
		sortedBuchListe.addAll(buchListe);
		
		
		for(Buch b: buchListe)
		{
			System.out.println(b.toString());
		}
		
		System.out.println("\n");
		
		for(Buch b: sortedBuchListe)
		{
			System.out.println(b.toString());
		}
		
	}

}
