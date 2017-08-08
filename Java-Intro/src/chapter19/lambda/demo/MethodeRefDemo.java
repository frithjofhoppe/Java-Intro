package chapter19.lambda.demo;

import java.util.function.Supplier;

public class MethodeRefDemo {

	public static void main(String[] args) {
		String s = "Ausgabe mit Methodenreferenz bzw. Lambda-Ausdruck";

		// Lambda Ausdruck
		print(() -> s.toString());

		// Methode Referenz
		print(s::toString);

	}

	public static void print(Supplier<String> supplier) {
		System.out.println(supplier.get());
	}

}