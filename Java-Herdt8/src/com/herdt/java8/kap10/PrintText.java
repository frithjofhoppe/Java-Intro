package com.herdt.java8.kap10;

public class PrintText implements Text
{
	public static void writeTextStatic()
	{
	    System.out.println("Tsch�ss!");
    }
	public static void main (String [] args)
	{
		PrintText pt = new PrintText();
		System.out.println(pt.supplyText());
		Text.writeTextStatic();
		pt.writeText();
		pt.writeTextStatic();
	}
}