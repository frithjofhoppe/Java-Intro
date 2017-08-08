package com.herdt.java8.kap13;

public class Person2 extends Person implements Comparable<Person2>
{
  public Person2()
  {
    super();
  }

  public Person2(String lastname, String prename, int personalNr)
  {
    super(lastname, prename, personalNr);
  }

  public int compareTo(Person2 o)
  {
    if ((o == null) || (o.getClass() != getClass()))
      return -1;
    int i = getLastname().compareTo(o.getLastname());
    if (i != 0)
      return i;
    else
    {
      i = getPrename().compareTo(o.getPrename());
      if (i != 0)
        return i;
      else
      {
        i = getPersonalNr() - o.getPersonalNr();
        return i;
      }
    }
  }
}
