package com.herdt.java8.kap18;

import java.util.Random;

class Gauss
{

  public static void main(String[] args)
  {
    int n = 10000;
    Random rd = new Random();
    double[] x = new double[n];
    double mittel = 0.0;
    double streuung = 0.0;
    for (int i = 0; i < n; i++)
    {
      x[i] = rd.nextGaussian();
      mittel += x[i];
    }
    mittel /= n;
    for (double g : x)
      streuung += (g - mittel) * (g - mittel);
    streuung = Math.sqrt(streuung / (n - 1));
    System.out.println("arithmetischer Mittelwert: " + mittel);
    System.out.println("Streuung:                  " + streuung);
  }

}
