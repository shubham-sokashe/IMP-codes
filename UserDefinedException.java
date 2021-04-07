package ExceptionHandlingScenario;

public class UserDefinedException {
	
	// method to get mobile number
	public static void getMobileNumber(String number) throws InvalidMobileNumberException {
		if(number.length() == 10) {
			char [] mobnumb = number.toCharArray();
			for(int i = 0 ; i < mobnumb.length ; i++) {
				if(!Character.isDigit(mobnumb[i])) {
					throw new InvalidMobileNumberException("You have entered non digit character :  " +  mobnumb[i]);
				}
			}
			System.out.println(" Your Mobile number has been registered.");
		}
		else {
			throw new InvalidMobileNumberException("Please enter valid mobile number") ;
		}
	}
	
	public static void main(String[] args) {
		String number = "880601015#";
		System.out.println("Mobile number you have entered is : " + number + "\n" );
		getMobileNumber(number);
	}

}

// user Defined Exception class
class InvalidMobileNumberException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public InvalidMobileNumberException(String message) {
		super(message);
	}
}