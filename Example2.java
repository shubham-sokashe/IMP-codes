package ExceptionHandlingScenario;


public class Example2 {

	
	
	public static void main(String[] args) {
		
		try {
			int [] nums = new int [10];
			nums[10]  = 10 / 0 ;
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException  e){
			System.out.println(e.getMessage());
			
		}
		
	}

}


// here we can get two exceptions that is Arithmetic and ArrayIndexOutOFBoud 
// but we are performing here assignment so..
// the right side will get calculated first..
// and here we will get ArithmeticException first 