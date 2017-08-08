package com.herdt.java8.kap10;

import com.herdt.java8.kap10.forms.*;

class UseForms2D
{
  public static void main(String[] args)
  {
    Forms2D firstForm = new Rectangle(2.0, 3.5);
    Forms2D secondForm = new Circle(3.0);

    System.out.printf("1. Form:%nFlächeninhalt: %g%nUmfang: %g%n",
                        firstForm.getArea(), firstForm.getPerimeter());

    System.out.printf("2. Form:%nFlächeninhalt: %g%nUmfang: %g%n",
                        secondForm.getArea(), secondForm.getPerimeter());

    System.out.println("firstForm instanceof Rectangle: "+ (firstForm instanceof Rectangle));
    System.out.println("firstForm instanceof Forms2D: "+ (firstForm instanceof Forms2D));
    System.out.println("firstForm instanceof Circle: "+ (firstForm instanceof Circle));
  }
}