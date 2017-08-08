package com.herdt.java8.kap10;

public class UseExampleIF3 implements ExampleIF, AnotherIF
{
	public String saySomething()
	{
		return AnotherIF.super.saySomething();
	}

	public static void main (String[] args)
	{
		UseExampleIF3 instance = new UseExampleIF3();
		System.out.println(instance.saySomething());
	}
}