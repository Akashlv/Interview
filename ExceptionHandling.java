class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}

public class ExceptionHandling {

	public static void main(String args[]) {
		try {
			if (10 < 18) {
				throw new InvalidAgeException("age is not valid to vote");
			}
		} catch (InvalidAgeException ex) {
			System.out.println("Caught the exception");

			System.out.println("Exception occured: " + ex);
		}
	}
}