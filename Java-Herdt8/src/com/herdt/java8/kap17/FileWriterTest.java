package com.herdt.java8.kap17;

import java.io.*;

class FileWriterTest
{
  public static void main(String[] args)
  {
    try
    {
      FileWriter fw = new FileWriter("testCharFile.dat");
      fw.write("1. Zeile: Test zur Ausgabe \r\n2. Zeile: in eine Datei.");
      fw.close();
    }
    catch(IOException ioex)
    {
      System.out.println(ioex.getMessage());
    }


  }
}