package com.herdt.java8.kap09;
class UsePackage
{
  public static void main(String[] args)
  {
    com.herdt.java8.kap09.forms.Cuboid oneForm =
                                new com.herdt.java8.kap09.forms.Cuboid(3, 5, 4);

    System.out.printf("Der Quarder (%d x %d x %d)%nhat die Oberfläche %d%n%n",
                      oneForm.getWidth(), oneForm.getLength(),
                      oneForm.getHeight(), oneForm.getArea());
  }
}
