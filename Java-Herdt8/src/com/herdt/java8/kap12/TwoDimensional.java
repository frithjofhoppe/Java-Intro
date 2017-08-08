package com.herdt.java8.kap12;
class TwoDimensional
{
  public static void main(String[] args)
  {
    int[][] field = new int[2][];
    field[0] = new int[4];
    field[0][0] = 23;
    field[0][1] = 74;
    field[0][2] = 56;
    field[0][3] = 14;
    field[1] = new int[3];
    field[1][0] = 17;
    field[1][1] = 38;
    field[1][2] = 21;
    for (int i = 0; i < field.length; i++)
    {
      System.out.println("Array " + i);

//      for (int j = 0; j < field[i].length; j++)
//        System.out.println(field[i][j]);

      for (int element : field[i])
        System.out.println(element);
    }
 }
}
