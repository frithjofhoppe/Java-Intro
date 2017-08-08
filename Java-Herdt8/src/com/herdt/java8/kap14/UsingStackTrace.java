package com.herdt.java8.kap14;

public class UsingStackTrace
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
      StackTraceElement[] stea = e.getStackTrace();
      StackTraceElement ste = stea[0];
      System.out.println("Fehler in Datei " + ste.getFileName() + ", Zeile " +
        ste.getLineNumber());
      System.out.println("Klasse: " + ste.getClassName());
      System.out.println("Methode: " + ste.getMethodName());
    }
  }
}