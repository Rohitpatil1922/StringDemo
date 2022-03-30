package custom_exception;

public class RollNoNotFoundException extends Exception {

	private static String message = "RollNo Not Found";

	public RollNoNotFoundException() {
		this(message);

	}

	public RollNoNotFoundException(String message) {
		super(message);

	}

}
