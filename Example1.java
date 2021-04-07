package ExceptionHandlingScenario;

public class Example1 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Division is :" + 10/0);
		}
		
		catch(Exception ae) {	
			ae = new ArithmeticException();
			System.out.println(ae.getMessage());
		}
		
		
	}

}


//  here we have assigned ArithmeticException to the parameter of catch block..
// since we haven't passed any parameter to the ArithmeticException constructor call
// it will consider default value of message as null 
// so o/p will be null

