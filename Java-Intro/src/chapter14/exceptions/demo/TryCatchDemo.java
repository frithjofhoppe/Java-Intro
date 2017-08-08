package chapter14.exceptions.demo;

public class TryCatchDemo {

	public static void main(String[] args) {

		System.out.println("Programm Start");

		try {
			int x = Integer.parseInt("125");
			System.out.println("x = " + x);

			int y = Integer.parseInt("a12");
			System.out.println("y = " + y);

		} catch (NumberFormatException e) {
			System.out.println("Exception = " + e.toString());
		}

		System.out.println("Programm Ende");

	}

}
