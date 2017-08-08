package com.herdt.java8.kap04;

class PrefixPostfix {
	public static void main(String[] args) {
		int i = 5;
		int j = 5;

		i++; // entspricht ++i;
				// i erhaelt den Wert 6
		System.out.println(i);

		j--; // entspricht --j;
				// j erhaelt den Wert 4
		System.out.println(j);

		i = 10;
		j = 10;

		int result1 = 2 * ++i; // result1 erhaelt den Wert 22
		System.out.println(result1);

		int result2 = 2 * j++; // result2 erhaelt den Wert 20
		System.out.println(result2);
	}
}
