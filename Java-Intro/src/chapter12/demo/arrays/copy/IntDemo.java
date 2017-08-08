package chapter12.demo.arrays.copy;

public class IntDemo {

	public static void main(String[] args) {

		// init
		int len = 3;

		int[] orig = new int[len];
		int[] copy = new int[len];

		orig[0] = 7;
		orig[1] = 14;
		orig[2] = 21;

		// copy (primitive)
		for (int i = 0; i < orig.length; i++) {
			copy[i] = orig[i];
		}

		// change orig
		orig[1] = 77;

		// show result
		System.out.println(orig[1]);
		System.out.println(copy[1]);
	}

}
