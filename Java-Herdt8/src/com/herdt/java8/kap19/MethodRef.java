package com.herdt.java8.kap19;
import java.util.function.Supplier;

public class MethodRef
{
	public static void print(Supplier<String> supplier)
	{
		System.out.println(supplier.get());
	}
	public static void main(String[] args)
	{
		String s = "Ausgabe mit Methodenreferenz bzw. Lambda-Ausdruck";
		print(() -> s.toString());
		print(s::toString);
	}
}