package com.herdt.java8.kap17;

import java.io.*;
import static  java.lang.Math.PI;

class PrintWriterStringTest
{
  public static void main(String[] args)
  {
    try
    {
      PrintWriter pw = new PrintWriter("testCStrPrint.dat");

      pw.println("Berechnung des Flächeninhalts für Kreise mit"); // Ausgabe eines Strings

      for(int r = 1; r <= 10; r++)
      {
        pw.print("Radius r = " + r + ": "); // Ausgabe eines Strings
        pw.println(PI * r * r); // Ausgabe eines double-Wertes
      }

      pw.close();

    }

    catch(IOException io)
    {
          System.out.println(io.getMessage());
    }
  }
}