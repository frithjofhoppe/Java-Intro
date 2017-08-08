package chapter14.exceptions.demo;

public class CustomException extends Exception {

	int errorNumber;

	public CustomException() {
		super();
	}

	public CustomException(String message) {
		super(message);
	}

	public CustomException(int errorNumber, String message) {
		super(message);
		this.errorNumber = errorNumber;
	}

	@Override
	public String getMessage() {
		return errorNumber + ":" + super.getMessage();
	}
}
