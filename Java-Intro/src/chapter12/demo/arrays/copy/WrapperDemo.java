package chapter12.demo.arrays.copy;

public class WrapperDemo {

	public static void main(String[] args) {

		Integer[] orig = { 1, 2, 3 };
		Integer[] copy = new Integer[orig.length];

		for (int i = 0; i < orig.length; i++) {
			copy[i] = orig[i];
		}

		System.out.println(copy[0]);
		System.out.println(copy[1]);
		System.out.println(copy[2]);

		orig[1] = 99;
		System.out.println(orig[1]);
		System.out.println(copy[1]);
	}

}
