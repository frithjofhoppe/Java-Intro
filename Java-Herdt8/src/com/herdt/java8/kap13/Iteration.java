package com.herdt.java8.kap13;
import java.util.*;
import static java.lang.System.*;

public class Iteration
{
  public static void main(String[] args)
  {
    ArrayList<String> arrList = new ArrayList<String>();
    int x = 0;
    for (int i = 1; i <= 10; i++)
      arrList.add("Obj" + i);
    Iterator<String> iter = arrList.iterator();

    while (iter.hasNext())
    {
      out.print(iter.next());
      if ((x++ % 2) == 0)      //jedes 2. Objekt soll geloescht werden
      {
        iter.remove();
        out.println(" - Objekt geloescht" );
      }
      else
        out.println("");
    }
    iter = arrList.iterator(); //Positionszeiger erzeugen (auf des erste Element)

    out.println("\nAusgabe der einzelnen Elemente der Liste:");
    while (iter.hasNext())
      out.print(iter.next() + " - ");

    out.print("\nPruefung: ");
    if (arrList.contains("Obj8"))
      out.println("Objekt 8 ist in der Liste enthalten");
    ListIterator<String> listIter =
           arrList.listIterator(arrList.indexOf("Obj8"));

    out.println("\nListe ab der aktuellen Position rueckwaerts durchlaufen:");
    while (listIter.hasPrevious())
      out.print(listIter.previous() + " - ");
    out.println();
  }
}
