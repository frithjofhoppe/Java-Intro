package com.herdt.java8.kap10;

public class UseExampleIF2 extends ExampleClass implements ExampleIF
{
	public static void main (String[] args)
	{
		UseExampleIF2 instance = new UseExampleIF2();
		System.out.println(instance.saySomething());
	}
}