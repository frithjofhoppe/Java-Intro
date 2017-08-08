package com.herdt.java8.kap17;

import java.io.*;

class StringWriterTest
{
  public static void main(String[] args)
  {
    String s = "Java macht Spass";
    StringWriter sw = new StringWriter();

    int l = s.length();

    for (int i = 0; i < l; i++)
    {
      s = s.substring(0, s.length() - 1);
      sw.write(s + "\n");
    }

    System.out.println(sw.toString());
  }
}