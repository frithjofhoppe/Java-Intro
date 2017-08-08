package com.herdt.java8.kap06;

class MethodsWithArguments {
	public static void main(String[] args) {
		Rectangle specialRect = new Rectangle();
		specialRect.width = 5;
		specialRect.length = 8;
		System.out.printf("Ein Rechteck:%nBreite: %d%nLaenge: %d%n", specialRect.width, specialRect.length);

		specialRect.buildSquare(7);
		System.out.printf("Ein Quadrat:%nBreite: %d%nLaenge: %d%n", specialRect.width, specialRect.length);
	}
}
