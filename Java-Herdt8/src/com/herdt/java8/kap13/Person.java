package com.herdt.java8.kap13;

public class Person
{
  private String lastname;
  private String prename;
  private int personalNr;

  public void setLastname(String lastname)
  {
    this.lastname = lastname;
  }

  public void setPrename(String prename)
  {
    this.prename = prename;
  }
  public void setPersonalNr(int personalNr)
  {
    this.personalNr = personalNr;
  }
  public String getLastname()
  {
    return lastname;
  }

  public String getPrename()
  {
    return prename;
  }

  public int getPersonalNr()
  {
    return personalNr;
  }

  public Person()
  {
    this("", "", 0);
  }

  public Person(String lastname, String prename, int personalNr)
  {
    setLastname(lastname);
    setPrename(prename);
    setPersonalNr(personalNr);
  }

  public int hashCode()
  {
    return getLastname().hashCode() + getPrename().hashCode() + getPersonalNr();
  }


  public boolean equals(Object o)
  {
    if ((o == null) || (o.getClass() != this.getClass()))
      return false;
    else
    {
      Person obj = (Person)o;
      return ((obj.getLastname().equals(getLastname()))
              && (obj.getPrename().equals(getPrename()))
              && (obj.getPersonalNr() == getPersonalNr()));
    }
  }
}
