package chapter14.exceptions.demo;

public class CustomExceptonDemo {

	public static void checkHeat() throws CustomException {
		// ...
		throw new CustomException(12, "Der Raumsensor ist ausser Betrieb.");
	}

	public static void main(String[] args) {
		try {
			checkHeat();
		} catch (CustomException e) {
			System.out.println(e.toString());
		}
	}
}
