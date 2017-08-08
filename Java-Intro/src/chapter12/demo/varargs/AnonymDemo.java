package chapter12.demo.varargs;

public class AnonymDemo {

	public static void print(String[] words) {

		for (String word : words) {
			System.out.print(word);
			System.out.print(" ");
		}

	}

	public static void main(String[] args) {
		print(new String[] { "Heute", "ist", "ein", "schöner", "Tag." });
		print(new String[] { "Finden", "Sie", "nicht", "auch?" });
	}

}
