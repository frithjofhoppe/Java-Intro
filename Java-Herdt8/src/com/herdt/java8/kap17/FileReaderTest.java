package com.herdt.java8.kap17;

import java.io.*;

class FileReaderTest
{
  public static void main(String[] args)
  {
    String text = "";
    int x = 0;

    try
    {
      FileReader fr = new FileReader("testCharFile.dat");

      while((x = fr.read()) != -1)  //zeichenweise lesen bis EndOfFile(-1), Rueckgabewert ist Integer
        text += (char)x;            //Integer in Character umwandeln und an String haengen

      fr.close();
    }

    catch (IOException io)
    {
      System.out.println(io.getMessage());
    }

    System.out.println(text);
  }
}