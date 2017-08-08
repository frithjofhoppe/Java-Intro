package com.herdt.java8.kap08;

class TypeVerification {
	public static void main(String args[]) {
		Rectangle firstForm = new Cuboid();
		Rectangle secondForm = new Rectangle();
		if (firstForm instanceof Cuboid) {
			System.out.println("firstForm ist komptibel zu Cuboid ");
			Cuboid oneCuboid = (Cuboid) firstForm;
		} else
			System.out.println("firstForm ist zu Cuboid nicht komptibel");
		if (secondForm instanceof Cuboid) {
			System.out.println("secondForm ist komptibel zu Cuboid ");
			Cuboid anotherCuboid = (Cuboid) secondForm;
		} else
			System.out.println("secondForm ist zu Cuboid nicht komptibel");
	}
}
