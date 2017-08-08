package chapter12.demo.arrays.multidim;

public class IrregularArray {

	public static void main(String[] args) {

		int[][] irregularArray = new int[][] { { 3, 1 }, { -1 }, { 5, 2, 0 } };

		int[] elem0 = irregularArray[0]; // array 0 = {3,1}

		int[] elem1 = irregularArray[1]; // array 1 = {-1}
		int elem1_0 = irregularArray[1][0]; // array {-1}, element 0 = -1

		int[] elem2 = irregularArray[2]; // array 2 = {5,2,0}

	}
}
