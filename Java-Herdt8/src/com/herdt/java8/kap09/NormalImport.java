package com.herdt.java8.kap09;
import java.lang.Math;
class NormalImport
{
  public static void main(String[] args)
  {
    double d = 256.00;
    System.out.printf("Die Kreiszahl PI lautet: %f%n", Math.PI);
    System.out.printf("Die Quadratwurzel von %f ist %f%n", d, Math.sqrt(d));
  }
}
