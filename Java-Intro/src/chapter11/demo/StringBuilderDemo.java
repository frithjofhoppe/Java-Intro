package chapter11.demo;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		sb.append("Hello");
		sb.append(" ");
		sb.append("World");

		System.out.println(sb.toString()); // Ausgabe: Hello World

	}

}
