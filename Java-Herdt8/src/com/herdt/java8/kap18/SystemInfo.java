package com.herdt.java8.kap18;

import java.util.*;
import java.io.*;

public class SystemInfo
{
  public static void main(String[] args)
  {
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
