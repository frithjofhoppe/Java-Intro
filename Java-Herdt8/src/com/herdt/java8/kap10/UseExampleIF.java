package com.herdt.java8.kap10;

public class UseExampleIF implements ExampleIF
{
	public static void main (String[] args)
	{
		UseExampleIF instance = new UseExampleIF();
		System.out.println(instance.saySomething());
	}
}