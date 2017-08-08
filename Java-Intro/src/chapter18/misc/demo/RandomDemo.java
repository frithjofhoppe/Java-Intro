package chapter18.misc.demo;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {

		Random random = new Random();

		System.out.println("Zufallszahlen zwischen 0..99:");
		for (int i = 0; i < 5; i++) {
			System.out.println(random.nextInt(100));
		}

	}

}
