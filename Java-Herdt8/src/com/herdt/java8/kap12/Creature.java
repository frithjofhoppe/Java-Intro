package com.herdt.java8.kap12;

public enum Creature
{
  SNAKE(0), LIZARD(4), FISH(0), SPIDER(8), INSECT(6);
  private int legs;

  Creature(int legs)
  {
    this.legs = legs;
  }

  int getLegs()
  {
    return legs;
  }

  String description()
  {
    String s = this.toString() + "s have ";
    if (getLegs() > 0)
    {
      s = s + getLegs();
    }
    else
    {
      s = s + "no";
    }
    return s + " legs.";
  }
}
