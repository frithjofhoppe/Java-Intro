package com.herdt.java8.kap04;

class Sign {
	public static void main(String[] args) {
		int i = 3;
		int k = 5;
		int result = 0;

		result = -i; // result erhaelt den Wert -3
		System.out.println(result);

		result = -(i - 5); // result erhaelt den Wert 2
		System.out.println(result);

		result = -(-3); // result erhaelt den Wert 3
		System.out.println(result);
	}
}
