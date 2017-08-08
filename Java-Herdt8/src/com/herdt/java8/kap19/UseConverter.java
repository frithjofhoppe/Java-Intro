package com.herdt.java8.kap19;
public class UseConverter
{
	static double calculation(Converter converter, double input)
	{
		return converter.convert(input);
	}

	public static void main(String[] args)
	{
		System.out.println(calculation(input -> (input-32)*5.0/9.0, 100 ));
		System.out.println(calculation(input -> (input/1.609344), 10));
	}

}