package exceptionHandling;

// code to check age using user defined exception 

public class CustomizedException {
	
	
	// method to check age
	public static void checkAge(int age) throws TooyoungException, TooOldException {
		if(age < 18) {
			throw new TooyoungException();
		}
		
		else if(age > 60) {
			throw new TooOldException();
		}
		else {
			System.out.println("Your are eligible to vote");
		}
	}

	public static void main(String[] args) {
		checkAge(120);

	}

}



class TooyoungException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	static String message = "Your are too young too vote.";
	
	public TooyoungException() {
			super(message);
		}
		
	}

class TooOldException extends RuntimeException{
	public TooOldException() {
		
	}

	@Override
	public String toString() {
		return "TooOldException : Your are too old to vote ";
	}
	
	
	
}