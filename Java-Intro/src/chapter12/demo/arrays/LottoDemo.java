package chapter12.demo.arrays;


public class LottoDemo {

	public static void print(int[] lotto) {

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]);
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// Variante A
		int[] lottoA; // Deklaration
		lottoA = new int[7]; // Speicher allozieren

		lottoA[0] = 45;
		lottoA[1] = 7;
		lottoA[2] = 12;
		lottoA[3] = 31;
		lottoA[4] = 27;
		lottoA[5] = 28;
		lottoA[6] = 9;

		System.out.print("lottoA = ");
		LottoDemo.print(lottoA);

		// Variante B
		int len = 7;
		int[] lottoB; // Deklaration
		lottoB = new int[len]; // Speicher allozieren

		lottoB[0] = 45;
		lottoB[1] = 7;
		lottoB[2] = 12;
		lottoB[3] = 31;
		lottoB[4] = 27;
		lottoB[5] = 28;
		lottoB[6] = 9;

		System.out.print("lottoB = ");
		LottoDemo.print(lottoB);

		// Variante C
		int[] lottoC = new int[7];

		lottoC[0] = 45;
		lottoC[1] = 7;
		lottoC[2] = 12;
		lottoC[3] = 31;
		lottoC[4] = 27;
		lottoC[5] = 28;
		lottoC[6] = 9;

		System.out.print("lottoC = ");
		LottoDemo.print(lottoC);

		// Variante D
		int[] lottoD = { 45, 7, 12, 31, 27, 28, 9 };

		System.out.print("lottoD = ");
		LottoDemo.print(lottoD);

	}
}
