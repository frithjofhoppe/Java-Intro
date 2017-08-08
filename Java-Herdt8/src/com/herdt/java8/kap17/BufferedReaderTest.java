package com.herdt.java8.kap17;

import java.io.*;

class BufferedReaderTest
{
  public static void main(String[] args)
  {
    String s;
    BufferedReader br = null;
    try
    {
      br = new BufferedReader(new FileReader("testCharBuffer.dat"));
      try
      {
        while ((s = br.readLine()) != null)
          System.out.println(s);
      }
      finally
      {
        if (br != null)
          br.close();
      }
    }
    catch (IOException io)
    {
      System.out.println(io.getMessage());
    }
  }
}