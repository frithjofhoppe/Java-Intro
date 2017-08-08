package com.herdt.java8.kap12;

class SortArray
{
  public static void main(String[] args)
  {
    int[] someNumbers = {11, 23, 4, 17, 6};

    java.util.Arrays.sort(someNumbers);

    for(int value: someNumbers)
      System.out.println(value);
    String s = java.util.Arrays.toString(someNumbers);
    System.out.println(s);
  }
}
