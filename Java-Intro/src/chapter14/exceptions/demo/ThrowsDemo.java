package chapter14.exceptions.demo;

public class ThrowsDemo {

	public static void print(String message) {
		if (message == null) {
			throw new IllegalArgumentException(
					"Der Paramter message darf nicht null sein.");
		}
		System.out.println(message);
	}

	public static void main(String[] args) {
		try {
			print("Message A");
			print(null);
			print("Message B");

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
