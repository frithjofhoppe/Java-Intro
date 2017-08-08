package com.herdt.java8.kap09;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*;

class StaticImport
{
  public static void main(String[] args)
  {
    double d = 256.00;
    System.out.printf("Die Kreiszahl PI lautet: %f%n", PI);
    System.out.printf("Die Quadratwurzel von %f ist %f%n", d, sqrt(d));
  }
}
