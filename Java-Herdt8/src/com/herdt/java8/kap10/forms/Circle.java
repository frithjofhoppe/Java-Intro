package com.herdt.java8.kap10.forms;

import static java.lang.Math.PI;

public class Circle implements Forms2D
{
//Attribute
  private double radius;

//Getter und Setter-Methoden
  public double getRadius()
  {
    return radius;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }

//Konstruktoren
  public Circle()
  {
    this(1.0);
  }

  public Circle(double radius)
  {
    setRadius(radius);
  }

//Implementierung der Interface-Methoden
  public double getArea()
  {
    return PI * getRadius() * getRadius();
  }

  public double getPerimeter()
  {
    return 2.0 * PI * getRadius();
  }
}