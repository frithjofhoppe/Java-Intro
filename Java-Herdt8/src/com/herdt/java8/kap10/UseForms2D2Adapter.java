package com.herdt.java8.kap10;

import com.herdt.java8.kap10.forms.*;

class UseForms2D2Adapter
{
  public static void main(String[] args)
  {
    Forms2D2 firstForm = new Circle2(3.0);

    System.out.printf("1. Form:%nFlächeninhalt: %g%nUmfang: %g%n",
                        firstForm.getArea(), firstForm.getPerimeter());

    firstForm.turn90();

    System.out.printf("1. Form:%nFlächeninhalt: %g%nUmfang: %g%n",
                        firstForm.getArea(), firstForm.getPerimeter());
  }
}