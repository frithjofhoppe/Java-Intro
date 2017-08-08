package com.herdt.java8.kap17;

import java.io.*;

class KonsoleReaderTest
{
  public static void main(String[] args)
  {
    try
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Geben Sie eine Integerzahl ein: ");
      String s = br.readLine();
      int x = Integer.parseInt(s);
      System.out.println("Die eingegebenen Zahl heisst: " + x);
    }
    catch (IOException io)
    {
      System.out.println(io.getMessage());
    }
    catch (NumberFormatException ex)
    {
      System.out.println("Fehlerhafte Integerzahl gelesen: " + ex.getMessage());
    }

  }
}