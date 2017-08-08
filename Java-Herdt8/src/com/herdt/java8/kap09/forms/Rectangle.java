package com.herdt.java8.kap09.forms;

public class Rectangle       // Klassendefinition
{
/*
* Attribute
*/
  private int width = 0;             // Breite des Rechtecks in cm
  private int length = 0;            // Laenge des Rechtecks in cm

/*
* Getter und Setter
*/
  public int getWidth()
  {
    return width;
  }

  public int getLength()
  {
    return length;
  }

  public void setWidth(int width)
  {
    this.width = width;
  }

  public void setLength(int length)
  {
    this.length = length;
  }

/*
* Constructor
*/
  public Rectangle()
  {
    this(1, 1);   //Konstruktoraufruf: Rechteck mit breite=1 und laenge=1
  }

  public Rectangle(int width)            //Quadrat: breite und laenge sind gleich
  {
    this(width, width);           //Konstruktoraufruf: breite=laenge
  }

  public Rectangle(int width, int length) //allgemeines Rechteck
  {
    setWidth(width);
    setLength(length);
  }

/*
* Methoden
*/
  public void swapWidthLength()     // Methode ohne Parameter
  {
    int temp = getWidth();        // lokale Variable
    setWidth(getLength());
    setLength(temp);
  }

  public void buildSquare(int sideLength) // Methode mit Parameter
  {
    setWidth(sideLength);
    setLength(sideLength);
  }

  public void resize(int width, int length)
  {
    setWidth(width);
    setLength(length);
  }

  public void resize(double factor)
  {
    setWidth((int)(factor * getWidth()));
    setLength((int)(factor * getLength()));
  }

  public int getArea()                     // Methode mit Parameter und ohne Rueckgabewert
  {
    return getWidth() * getLength();
  }

}