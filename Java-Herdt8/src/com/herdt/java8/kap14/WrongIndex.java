package com.herdt.java8.kap14;

public class WrongIndex
{
  public static void main(String[] args)
  {
    int i = -1;

    try
    {
      if ((i < 1) | (i > 100))
        throw new IndexOutOfMinMaxException(1, 100);
    }
    catch (IndexOutOfMinMaxException e)
    {
      System.out.println(e.getMessage());
    }
  }
}
