package com.herdt.java8.kap10.forms;

public class Rectangle implements Forms2D
{
//Attribute
  private double width = 0.0;          // Breite des Rechtecks in cm
  private double length = 0.0;         // Laenge des Rechtecks in cm

//Getter und Setter
  public double getWidth()
  {
    return width;
  }

  public double getLength()
  {
    return length;
  }

  public void setWidth(double width)
  {
    this.width = width;
  }

  public void setLength(double length)
  {
    this.length = length;
  }

//Constructor
  public Rectangle()
  {
    this(1.0, 1.0);             //Konstruktoraufruf: Rechteck mit breite=1 und laenge=1
  }

  public Rectangle(double width)
  {
    this(width, width);           //Konstruktoraufruf: breite=laenge (Quadrat)
  }

  public Rectangle(double width, double length) //allgemeines Rechteck
  {
    setWidth(width);
    setLength(length);
  }

//Implementierung der Interface-Methoden
  public double getArea()
  {
    return getWidth() * getLength();
  }

  public double getPerimeter()
  {
    return 2.0 * (getWidth() + getLength());
  }
}