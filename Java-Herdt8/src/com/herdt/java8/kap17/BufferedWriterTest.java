package com.herdt.java8.kap17;

import java.io.*;

class BufferedWriterTest
{
  public static void main(String[] args)
  {
    char[] ca = {'k', 'n', 'r', '0', '1'};
    try
    {
      BufferedWriter bw = new BufferedWriter(new FileWriter("testCharBuffer.dat"));
      for (int i = 0; i < 100; i++)
      {
        bw.write(ca);
        bw.newLine();
      }
      bw.close();
    }
    catch(IOException io)
    {
      System.out.println(io.getMessage());
    }


  }
}