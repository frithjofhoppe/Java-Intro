package chapter12.demo.arrays.multidim;

public class TableDemo {

	static final int ROWS = 2;
	static final int COLS = 4;

	public static void main(String[] args) {

		double[][] table = new double[ROWS][COLS];

		table[0][0] = 0.0;
		table[0][1] = 0.1;
		table[0][2] = 0.2;
		table[0][3] = 0.3;

		table[1][0] = 1.0;
		table[1][1] = 1.1;
		table[1][2] = 1.2;
		table[1][3] = 1.3;

		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLS; col++) {
				System.out.print(table[row][col]);
				System.out.print("  ");
			}
			System.out.println();
		}
	}

}
