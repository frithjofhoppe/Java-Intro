package com.herdt.java8.kap04;

class ReducedNotation {
	public static void main(String[] args) {
		int i = 15;
		int k = 3;

		i += 5; // ausfuehrlich: i = i + 5; -> i erhaelt den Wert 20
		System.out.println(i);
		i += k; // ausfuehrlich: i = i + k; -> i erhaelt den Wert 23
		System.out.println(i);
		i -= 7; // ausfuehrlich: i = i - 7; -> i erhaelt den Wert 16
		System.out.println(i);
		i /= k; // ausfuehrlich: i = i / k; -> i erhaelt den Wert 5
		System.out.println(i);
		i *= 7; // ausfuehrlich: i = i * 7; -> i erhaelt den Wert 35
		System.out.println(i);
		i %= 4; // ausfuehrlich: i = i % 4; -> i erhaelt den Wert 3
		System.out.println(i);
	}
}
