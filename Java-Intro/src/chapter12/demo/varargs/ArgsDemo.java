package chapter12.demo.varargs;

public class ArgsDemo {

	public static void print(String[] words) {

		// Paramter ausgeben
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i]);
			System.out.print(" ");
		}

		// Alternative mit dem for each Loop
		for (String word : words) {
			System.out.print(word);
			System.out.print(" ");
		}

	}

	public static void main(String[] args) {
		String[] words = { "Heute", "ist", "ein", "schöner", "Tag." };
		print(words);
	}

}
