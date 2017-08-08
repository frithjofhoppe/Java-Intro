package com.herdt.java8.kap14;

public class TryAndCatch
{
  public static void main(String[] args)
  {
    String s = "ABC";
    try
    {
      int i = Integer.parseInt(s);
      System.out.println("Die Zahl ist " + i);
    }
    catch (NumberFormatException e)
    {
      System.out.println(s + " konnte nicht in eine Zahl umgewandelt werden.");
    }
  }
}
