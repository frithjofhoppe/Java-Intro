package com.herdt.java8.kap10;

public interface Text
{
  public default String supplyText()
  {
    return "Guten Tag.";
  }
  public default void writeText()
    {
      System.out.println("Noch da?");
  }
  public static void writeTextStatic()
  {
    System.out.println("Auf Wiedersehen!");
  }
}