package com.herdt.java8.kap15;

class AssertTest
{
  public static void main(String args[])
  {
    final int TEMPERATURE_STANDARD = 20;
    int i = 0;
    try
    {
      if (args.length > 0)
        i = Integer.parseInt(args[0]);
      if (!((i >= 10) && (i <= 50)))
        i = TEMPERATURE_STANDARD;
    }
    catch (NumberFormatException nfe)
    {
      System.out.println("Als Parameter eine Zahl zwischen 10 und 50 eingeben.");
    }
    assert ((i >= 10) && (i <= 50)):
             "ASSERT: Die Zahl " + i + " lag nicht zwischen 10 und 50";
    System.out.println("Eingestellte Temperatur: " + i);
  }
}
