package com.herdt.java8.kap11;
import static java.lang.System.out;

class StringCompare
{
  public static void main(String[] args)
  {
    String s1 = "text";
    String s2 = new String("Text");
    String s3 = new String("Context");
    out.println("Gross- und Kleinschreibung berücksichtigen:");
    out.printf("%s und %s: %b%n", s1, s2, (s1.equals(s2)));           //false
    out.println("\nGross- und Kleinschreibung nicht berücksichtigen:");
    out.printf("%s und %s: %b%n", s1, s2, (s1.equalsIgnoreCase(s2))); //true
    out.println("\nLexikografischer Vergleich:");
    out.printf("%s und %s: %d%n", s1, s2, (s1.compareTo(s2)));        //32
    out.println("\nPruefen ob ein String in einem anderen enthalten ist:");
    out.printf("%s in %s: %b%n", s1, s3, (s3.contains(s1)));          //true
    out.printf("%s in %s: %b%n", s2, s3, (s3.contains(s2)));          //false
  }
}