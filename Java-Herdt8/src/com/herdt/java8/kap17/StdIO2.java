package com.herdt.java8.kap17;

import java.io.*;
import static java.lang.System.*;

class StdIO2
{
  public static void main(String[] args)
  {
    byte[] b = new byte[1];
    try
    {
      out.print("Bitte geben Sie ein Zeichen ein: ");
      in.read(b);
      out.println((char)b[0] + " hat den ASCII-Code " + b[0]);
      out.print("Bitte geben Sie noch ein Zeichen ein: ");
      in.skip(in.available());
      in.read(b);
      out.println((char)b[0] + " hat den ASCII-Code " + b[0]);
    }
    catch (IOException ioex)
    {
      out.println(ioex.getMessage());
    }

  }
}