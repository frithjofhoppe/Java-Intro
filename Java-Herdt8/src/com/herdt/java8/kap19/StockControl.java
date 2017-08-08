package com.herdt.java8.kap19;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StockControl
{
	public static void main(String[] args)
	{
		Item[] items =
		{
		  new Item("Bleistift", 75),
		  new Item("Ordner", 120)
	  	};

	  	for (Item item: items)
	  	{
			refill(item,
			       item_ -> item_.getItemQuantity() < 100,
			       item_ -> item_.addUnits(100));
			System.out.println(item);
		}
	}

	public static void refill(Item item,
	                          Predicate<Item> predicate,
	                          Consumer<Item> consumer)
	{
	// Mit predicate bestimmen, ob der Bestand aufgefüllt werden muss
	// consumer führt Auffüllaktion aus
	if (predicate.test(item))
	  consumer.accept(item);
  }
}
