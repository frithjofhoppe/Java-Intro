package com.herdt.java8.kap10;

public interface ExampleIF extends ExampleSuperIF
{
	public default String saySomething()
	{
		return "Hallo aus dem Interface ExampleIF";
	}
}