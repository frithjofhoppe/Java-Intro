package com.herdt.java8.kap12;

class UsingVarargs
{

  UsingVarargs()
  {
    double result1 = average(1.2, 9.3, 4.5, 6.7);      //Wert von result1: 5,425
    double result2 = average(4.8, 9.2);                //Wert von result2: 7.0
    double result3 = average(new double[] {4.8, 9.2}); //Wert von result3: 7.0

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);

  }

  public static void main(String[] args)
  {
    new UsingVarargs();
  }

  double average(double ... values)
  {
    double sum = 0.0;
    for (double d : values)
      sum += d;
    return sum / values.length;
  }
}