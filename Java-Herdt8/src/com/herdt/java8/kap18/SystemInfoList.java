package com.herdt.java8.kap18;

import java.util.*;
import java.io.*;

public class SystemInfoList
{
  public static void main(String[] args)
  {
    printSysInfo();
  }

  static void printSysInfo()
  {
    Properties props = System.getProperties();
    System.out.println("Systemeigenschaften:\n");
    props.list(System.out);
 }
}
