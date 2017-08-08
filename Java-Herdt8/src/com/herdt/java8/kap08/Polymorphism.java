package com.herdt.java8.kap08;

class Polymorphism {
	public static void main(String args[]) {
		Rectangle oneForm = new Rectangle(3, 5);
		Rectangle secondForm = new Cuboid(3, 5, 4);
		Rectangle thirdForm = new Pyramid(3, 5, 4);

		System.out.printf("Das Objekt (%d x %d)%nhat die Oberflaeche %d%n%n", oneForm.getWidth(), oneForm.getLength(),
				oneForm.getArea());
		System.out.printf("Das Objekt (%d x %d)%nhat die Oberflaeche %d%n%n", secondForm.getWidth(),
				secondForm.getLength(), secondForm.getArea());
		System.out.printf("Das Objekt (%d x %d)%nhat die Oberflaeche %d%n%n", thirdForm.getWidth(),
				thirdForm.getLength(), thirdForm.getArea());
	}
}
