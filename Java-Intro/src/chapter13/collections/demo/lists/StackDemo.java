package chapter13.collections.demo.lists;

import java.io.IOException;
import java.util.Stack;

import util.Reader;

public class StackDemo {

	public static void main(String[] args) throws IOException {

		Stack<String> stack = new Stack<String>();
		System.out.println("Der Stack hat Grösse " + stack.size());

		System.out.println("Bitte geben Sie drei Texte ein:");
		for (int i = 0; i < 3; i++) {
			String x = Reader.readln("Text " + i + " = ");

			stack.push(x);
		}

		System.out.println("Der Stack hat Grösse " + stack.size());

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

		System.out.println("Der Stack hat Grösse " + stack.size());

	}

}
