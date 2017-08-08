package chapter03.helloworld.demo;

public class Echo {

	/**
	 * Beispiel Programm Parameter.
	 */
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println("Argument #" + i + " = " + args[i]);
		}

		System.out
				.println("Es wurden " + args.length + " Argumente übergeben.");
	}

}
