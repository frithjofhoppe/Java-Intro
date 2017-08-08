package chapter19.lambda.demo;

import java.util.Arrays;

public class MethodeRefDemo2 {

	public static void main(String[] args) {
		String[] words = { "3 ", " 2 ", "", " 1" };

		System.out.println("Resultat:");
		
		Arrays.stream(words).map(String::trim).filter((s) -> !s.isEmpty()).map(Integer::parseInt).sorted()
				.forEach(System.out::println); // Ausgabe = 1 2 3

	}

} // end