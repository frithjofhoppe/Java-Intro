package com.herdt.java8.kap17;

import java.io.*;

class StringReaderTest
{
  public static void main(String[] args)
  {
    String s = "Java macht Spass";
    StringReader sr = new StringReader(s);

    int z;

    try
    {
      while ((z = sr.read()) != -1)
         System.out.println((char)z);
    }

    catch (IOException io)
    {
      System.out.println(io.getMessage());
    }

  }
}