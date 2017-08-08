package com.herdt.java8.kap11;

class PrintfString
{
  public static void main(String[] args)
  {
    String text = "Rechteck";
    int i = 4;
    System.out.printf("Ein %s hat %d Ecken.%n",
                       text, i);
  }
}