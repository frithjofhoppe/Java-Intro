package com.herdt.java8.kap17;

import java.io.*;

class StdIO1
{
  public static void main(String[] args)
  {
    byte[] b = new byte[1];
    try
    {
      System.out.print("Bitte geben Sie ein Zeichen ein: ");
      System.in.read(b);
      System.out.println((char)b[0] + " hat den ASCII-Code " + b[0]);
    }
    catch (IOException io)
    {
      System.out.println(io.getMessage());
    }
  }
}