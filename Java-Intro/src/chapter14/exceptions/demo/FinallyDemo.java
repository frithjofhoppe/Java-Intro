package chapter14.exceptions.demo;

public class FinallyDemo {

	public static void print(String message) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		try {
			if (message == null) {
				Thread.currentThread().sleep(3);
				throw new IllegalArgumentException();
			}
			System.out.println(message);

		} finally {
			long endTime = System.currentTimeMillis() - startTime;
			System.out.println("print used " + endTime + " ms");
		}
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
