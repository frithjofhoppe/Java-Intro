package com.herdt.java8.kap11;

class Wrapper
{
  public static void main(String[] args)
  {
    Integer i1 = new Integer(10);       // neues Integer-Objekt mit dem Wert 10 erzeugen
    Integer i2 = Integer.valueOf("24"); // neues Integer-Objekt mit dem Wert 24 erzeugen
    int i = i1.intValue();              // gespeicherten int-Wert von i1 liefern
    int j = Integer.parseInt("35");     // Stringkonvertierung nach int
    String s = Integer.toString(74);    // Umwandlung einer int-Zahl in einen String
    System.out.println(i1.toString());
    System.out.println(i2.toString());
    System.out.println(i);
    System.out.println(j);
    System.out.println(s);
  }
}
