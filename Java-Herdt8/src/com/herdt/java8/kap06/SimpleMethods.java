package com.herdt.java8.kap06;

class SimpleMethods {
	public static void main(String[] args) {
		Rectangle specialRect = new Rectangle();
		specialRect.width = 5;
		specialRect.length = 8;
		System.out.printf("Urspruenglich:%nBreite: %d%nLaenge: %d%n", specialRect.width, specialRect.length);

		specialRect.swapWidthLength();
		System.out.printf("Vertauscht:%nBreite: %d%nLaenge: %d%n", specialRect.width, specialRect.length);
	}
}
