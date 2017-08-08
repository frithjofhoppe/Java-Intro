package com.herdt.java8.kap09;
import com.herdt.java8.kap09.forms.*;

class ImportPackage
{
  public static void main(String[] args)
  {
    Cuboid oneForm = new Cuboid(3, 5, 4);
    Pyramid anotherForm = new Pyramid(3, 3, 6);
    System.out.printf("Das Objekt (%d x %d)%nhat die Oberfläche %d%n%n",
                      oneForm.getWidth(),oneForm.getLength(),
                      oneForm.getArea());
    System.out.printf("Das Objekt (%d x %d)%nhat die Oberfläche %d%n%n",
                      anotherForm.getWidth(),anotherForm.getLength(),
                      anotherForm.getArea());
  }
}
