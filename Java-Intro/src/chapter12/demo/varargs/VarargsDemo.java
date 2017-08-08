package chapter12.demo.varargs;

public class VarargsDemo {

	public static void print(String text) {
		System.out.println("Print mit einem Parameter:");
		System.out.print(text);
		System.out.println();
	}

	public static void print(String text1, String text2) {
		System.out.println("Print mit zwei Parametern:");
		System.out.print(text1 + " " + text2);
		System.out.println();
	}

	public static void print(String... words) {
		System.out.println("Print mit variabler Anzahl Parameter:");
		for (String word : words) {
			System.out.print(word);
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		print("Wort");
		print("Zwei", "Wörter");
		print("Heute", "ist", "ein", "schöner", "Tag.");
	}

}
