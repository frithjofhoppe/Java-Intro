package com.herdt.java8.kap06;

class MethodsWithReturn {
	public static void main(String[] args) {
		Rectangle specialRect = new Rectangle();

		specialRect.width = 5;
		specialRect.length = 8;

		System.out.printf("Das Rechteck (%d x %d)%nhat die Flaeche %d%n", specialRect.width, specialRect.length,
				specialRect.getArea());
	}
}
