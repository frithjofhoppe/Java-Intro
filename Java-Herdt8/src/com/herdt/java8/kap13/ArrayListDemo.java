package com.herdt.java8.kap13;

import java.util.*;

public class ArrayListDemo
{
  public static void main(String args[] )
  {
    ArrayList<String> arrList = new ArrayList <String>();
    for (int i = 1; i <= 10; i++)
      arrList.add("Obj" + i);

///    arrList.add(new Integer(12));

//    for ( Iterator it = arrList.iterator(); it.hasNext(); )
//      System.out.println( it.next() );

    for (String element : arrList)
      System.out.println(element);
  }
}