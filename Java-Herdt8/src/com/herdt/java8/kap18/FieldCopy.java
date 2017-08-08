package com.herdt.java8.kap18;

import java.util.*;
import java.io.*;

public class FieldCopy
{
  public static void main(String[] args)
  {
    copyArray();
  }

  static void copyArray()
  {
    byte array1[] = new byte[20];
    byte array2[] = new byte[10];
    byte array3[] = new byte[10];
    System.out.print("Geben Sie 20 Zeichen ein: ");
    try
    {
      System.in.read(array1);
      System.arraycopy(array1, 0, array2, 0, 10);
      System.arraycopy(array1, 10, array3, 0, 10);
      System.out.print("Die ersten 10 Zeichen sind: ");
      System.out.write(array2);
      System.out.print("\nDie letzen 10 Zeichen sind: ");
      System.out.write(array3);
    }
    catch (IOException io)
    {
      System.out.print(io.getMessage());
    }
  }
}
