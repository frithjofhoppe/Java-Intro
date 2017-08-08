package com.herdt.java8.kap18;

import java.util.*;
import java.io.*;

public class SystemInfoToFile
{
  public static void main(String[] args)
  {
    try
    {
      System.setOut(new PrintStream(new FileOutputStream("SystemTest.txt")));
    }
    catch (FileNotFoundException fnfex)
    {
      System.out.println(fnfex);
      System.exit(1);
    }
    printSysInfo();
  }

  static void printSysInfo()
  {
    Enumeration props = System.getProperties().propertyNames();
    System.out.println("Systemeigenschaften:\n");

    while (props.hasMoreElements())
    {
      String prop = props.nextElement().toString();
      System.out.print(prop + ":");
      for (int i = prop.length(); i < 30; i++)
        System.out.print(" ");
      System.out.println(System.getProperty(prop));
    }
  }
}
