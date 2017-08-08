package chapter14.exceptions.demo;

public class StackTraceDemo {

	public static void main(String[] args) {

		try {
			int x = Integer.parseInt("125");
			System.out.println("x = " + x);

			int y = Integer.parseInt("a12");
			System.out.println("y = " + y);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
