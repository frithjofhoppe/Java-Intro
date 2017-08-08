package com.herdt.java8.kap18;

import java.util.*;
import java.io.*;

class UseConsole
{
  public static void main(String[] args)
  {

    Console con= System.console();
    if (con != null)
    {
      con.printf("Login:%n");
      String s = con.readLine("Geben Sie bitte Ihren Namen ein: ");
      con.printf("Guten Tag %s,%n", s);
      char[] pwchars = con.readPassword("geben Sie bitte Ihr Passwort ein: ");
      String pw = new String(pwchars);
      con.printf("Jetzt koennte das Passwort '%s' geprueft werden.", pw);
    }

    else
      System.out.println("Keine Console vorhanden");
  }
}
