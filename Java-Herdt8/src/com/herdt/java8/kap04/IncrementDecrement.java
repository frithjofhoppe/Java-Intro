package com.herdt.java8.kap04;

class IncrementDecrement {
	public static void main(String[] args) {
		int i = 3;
		double d = 1.5;

		i++; // ausfuehrlich: i = i + 1; -> i erhaelt den Wert 4
		System.out.println(i);
		d--; // ausfuehrlich: d = d - 1.0; -> d erhaelt den Wert 0.5
		System.out.println(d);
	}
}
