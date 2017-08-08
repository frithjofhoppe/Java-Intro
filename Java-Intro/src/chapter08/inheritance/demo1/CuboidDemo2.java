package chapter08.inheritance.demo1;

public class CuboidDemo2 {

	public static void main(String[] args) {

		Cuboid c = new Cuboid(10, 5, 7);

		System.out.println("Cuboid with: ");
		System.out.println("  length = " + c.getLength());
		System.out.println("  width  = " + c.getWidth());
		System.out.println("  height = " + c.getHeight());

	}

}
