package com.herdt.java8.kap13;

import java.util.*;

public class MapDemo
{
  public static void main(String[] args)
  {
    HashMap<String, Person2> hashmap = new HashMap<String, Person2>(11);
    Person2 personA = new Person2("Meier", "Heinz", 33);
    String keyA = "16233686";
    Person2 personB = new Person2("Schneider", "Guenther", 25);
    String keyB = "64376657";
    Person2 personC = new Person2("Geier", "Norbert", 49);
    String keyC = "68832346";
    Person2 personD = new Person2("Schneider", "Bernd", 41);
    String keyD = "45674576";
    Person2 personE = new Person2("Geier", "Norbert", 35);
    String keyE = "35243534";

    hashmap.put(keyA, personA);
    hashmap.put(keyB, personB);
    hashmap.put(keyC, personC);
    hashmap.put(keyD, personD);
    hashmap.put(keyE, personE);

    System.out.println("HashMap sequentiell durchlaufen:");
    for (Map.Entry<String, Person2> e: hashmap.entrySet())
    {
      String key = e.getKey();
      Person2 person = e.getValue();
      System.out.println("Schluessel: " + key +
                         "   Name: " + person.getLastname() + ", " +
                                       person.getPrename() +
                         "   Personal-Nr: " + person.getPersonalNr());
    }

    //Aus dem HashMap eine TreeMap erzeugen
    TreeMap<String, Person2> treemap = new TreeMap<String, Person2>(hashmap);

    System.out.println("\nTreeMap sequentiell durchlaufen:");
    for (Map.Entry<String, Person2> e: treemap.entrySet())
    {
      String key = e.getKey();
      Person2 person = e.getValue();
      System.out.println("Schluessel: " + key +
                         "   Name: " + person.getLastname() + ", " +
                                       person.getPrename() +
                         "   Personal-Nr: " + person.getPersonalNr());
    }
  }
}
