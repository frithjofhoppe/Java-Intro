package com.herdt.java8.kap12;

class CopyArray
{
  public static void main(String[] args)
  {
    int[] field = new int[10];
    for (int i = 0; i < field.length; i++)
    {
	  field[i] = 2 * i;
      System.out.printf("Element %d: %d%n",i, field[i]);
    }

    System.out.printf("Die ersten fuenf Elemente:%n");
    int[] firstFive = java.util.Arrays.copyOf(field, 5);
    for (int i = 0; i < firstFive.length; i++)
      System.out.printf("Element %d: %d%n",i, firstFive[i]);

    System.out.printf("Element 3 bis Element 7:%n");

    int[] threeToSeven = java.util.Arrays.copyOfRange(field, 3, 7);

    for (int i = 0; i < threeToSeven.length; i++)
      System.out.printf("Element %d: %d%n",i, threeToSeven[i]);
  }
}
