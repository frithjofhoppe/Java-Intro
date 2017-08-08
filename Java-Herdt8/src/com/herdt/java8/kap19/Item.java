package com.herdt.java8.kap19;
import java.util.ArrayList;
import java.util.List;

class Item
{
	private String article;
	private int quantity;

	Item(String article, int quantity)
	{
		this.article = article;
		this.quantity = quantity;
	}

	void addUnits(int number)
	{
		quantity += number;
	}

	int getItemQuantity()
	{
		return quantity;
	}

    String getItemName()
    {
		return article;
	}

    public void printName()
    {
		System.out.println("Artikel: " + article);
	}

	@Override
	public String toString()
	{
		return "Artikel: "  + article + ",Bestand: " + quantity;
	}

	public static List<Item> createList(){
	    List<Item> itemList = new ArrayList<>();

	    itemList.add( new Item("Bleistift", 75) );
		itemList.add( new Item("Ordner", 120) );
		itemList.add( new Item("Hefter", 45) );
		itemList.add( new Item("Kugelschreiber", 115) );
		itemList.add( new Item("Markierstift", 65) );
		itemList.add( new Item("Block A4", 180) );
		itemList.add( new Item("Block A5", 175) );

	    return itemList;
  }

}
