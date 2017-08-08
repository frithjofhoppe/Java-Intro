package com.herdt.java8.kap14;

public class PassException
{
  public PassException() throws ClassNotFoundException
  {
    Class specialClass;
    specialClass = Class.forName("xxx");  //Die Klasse xxx existiert nicht
  }

  public static void main(String[] args)
  {
    try
    {
      PassException w = new PassException();
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Klasse nicht gefunden");
    }
  }
}

