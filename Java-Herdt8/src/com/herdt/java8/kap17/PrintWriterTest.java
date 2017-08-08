package com.herdt.java8.kap17;

import java.io.*;
import static java.lang.Math.PI;

class PrintWriterTest
{
  public static void main(String[] args)
  {
    try
    {
      PrintWriter pw = new PrintWriter("testCharPrint.dat");

      pw.println("Ausgabe des Flächeninhalts für Kreise mit"); // String schreiben

      for(int r = 1; r <= 10; r++)
      {
        pw.print("Radius r = " + r + ": ");  //String schreiben
        pw.println(PI * r * r);    //double-Wert schreiben
      }

      pw.close();

    }

    catch (IOException io)
    {
          System.out.println(io.getMessage());
    }
  }
}