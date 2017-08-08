package com.herdt.java8.kap13;

import java.util.*;

public class TreeSetDemo
{
  public static void main(String[] args)
  {
    TreeSet<Person2> personTreeSet = new TreeSet<Person2>();
    Person2 personA = new Person2("Meier", "Heinz", 33);
    Person2 personB = new Person2("Schneider", "Guenther", 25);
    Person2 personC = new Person2("Geier", "Norbert", 49);
    Person2 personD = new Person2("Schneider", "Bernd", 41);
    Person2 personE = new Person2("Geier", "Norbert", 35);
    personTreeSet.add(personA);
    personTreeSet.add(personB);
    personTreeSet.add(personC);
    personTreeSet.add(personD);
    personTreeSet.add(personE);

    System.out.println("Ausgabe mit Positionszeiger");
    Iterator iter = personTreeSet.iterator();
    while (iter.hasNext())
    {
      Person2 x = (Person2)iter.next();
      System.out.println(x.getLastname() + ", " + x.getPrename() + " - Personal-Nr: " +
                         x.getPersonalNr());
    }
    System.out.println("\nAusgabe in einer foreach-Schleife");
    for (Person2 x: personTreeSet)
      System.out.println(x.getLastname() + ", " +
                         x.getPrename() + " - Personal-Nr: " +
                         x.getPersonalNr());
  }
}
