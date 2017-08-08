package com.herdt.java8.kap10.forms;

import static java.lang.Math.PI;

public class Circle2 extends Forms2D2Adapter
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
  public Circle2()
  {
    this(1.0);
  }

  public Circle2(double radius)
  {
    setRadius(radius);
  }

//Implementierung der benoetigten Adapter-Methoden
  public double getArea()
  {
    return PI * getRadius() * getRadius();
  }

  public double getPerimeter()
  {
    return 2.0 * PI * getRadius();
  }
}