package com.herdt.java8.kap09.forms;
/*
* Beschreibung einer Pyramide
*/
public class Pyramid extends Rectangle
{
/*
* Attribute
*/
  private int height;

/*
* Getter und Setter
*/
  public void setHeight(int height)
  {
    this.height = height;
  }
  public int getHeight()
  {
    return height;
  }
/*
* Konstruktoren
*/
  public Pyramid()
  {
    this(1,1,1);
    setHeight(20);
  }

  public Pyramid(int width, int length, int height)
  {
    super(width, length);    // Konstruktor der Superklasse wird aufgerufen
    setHeight(height);
  }

/*
* Methoden
*/
  public int getBase()
  {
    return super.getArea();
  }

  public int getVolume()
  {
    return getWidth() * getLength() * getHeight() / 3;
  }

  public int getArea()
  {
    return -1;
  }
}




