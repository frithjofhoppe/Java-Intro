package com.herdt.java8.kap13;

import java.util.*;

public class HashSetDemo
{
  public static void main(String[] args)
  {
    HashSet<Person> personSet = new HashSet<Person>();

    Person personA = new Person("Meier", "Heinz", 33);
    System.out.println("HashCode A: " + personA.hashCode());
    Person personB = new Person("Schneider", "Bernd", 25);
    System.out.println("HashCode B: " + personB.hashCode());
    Person personC = new Person("Geier", "Norbert", 49);
    System.out.println("HashCode C: " + personC.hashCode());
    Person personD = new Person("Klaus", "Guenther", 41);
    System.out.println("HashCode D: " + personD.hashCode());
    Person personE = new Person("Baumann", "Jens", 37);
    System.out.println("HashCode E: " + personE.hashCode());
    personSet.add(personA);
    personSet.add(personB);
    personSet.add(personC);
    personSet.add(personD);
    personSet.add(personE);
    Person personF = new Person("Baumann", "Jens", 37);
    System.out.println("Existiert F bereits? " + personSet.contains(personF));
    if (personSet.add(personF))
      System.out.println("F angefuegt");
    else
      System.out.println("F nicht angefuegt");
    System.out.println("HashSet mit Iterator durchlaufen:");
    Iterator iter = personSet.iterator();
    while (iter.hasNext())
      System.out.println("HashCode: " + iter.next().hashCode());
    System.out.println("HashSet mit foreach-Schleife durchlaufen:");
    for (Person eachPerson: personSet)
      System.out.println("HashCode: " + eachPerson.hashCode());
  }
}
