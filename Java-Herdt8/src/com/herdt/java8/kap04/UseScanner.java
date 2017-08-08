package com.herdt.java8.kap04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UseScanner {

	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Geben Sie einen ganzzahligen Wert ein: ");
			int i = sc.nextInt();
			System.out.printf("Es wurde die Zahl %d eingebenen", i);
		} catch (InputMismatchException ex) {
			System.out.println("Es wurde kein ganzzahliger Wert eingeben.");
		}
	}
}