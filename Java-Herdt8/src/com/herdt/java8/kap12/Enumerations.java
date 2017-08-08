package com.herdt.java8.kap12;

enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
enum WorkDays {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}
enum Grades {VERYGOOD, GOOD, SATISFACTORY, ADEQUATE, FAIL}

public class Enumerations
{
  public static void main(String[] args)
  {
     Days day = Days.MONDAY;
     System.out.println(day);
  }
}
