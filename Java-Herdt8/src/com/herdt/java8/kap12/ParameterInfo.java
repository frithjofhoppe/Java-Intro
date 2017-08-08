package com.herdt.java8.kap12;

class ParameterInfo
{

  public static void main(String[] args)
  {
    for (int i = 0; i < args.length; i++)
      System.out.println(args[i]);

  //verkuerzte Schreibweise - foreach
    for (String s : args)
      System.out.println(s);
  }
}
