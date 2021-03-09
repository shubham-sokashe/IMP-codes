package homeWork14022021;

//write a java program which accepts two numbers and in result it should give maximum number

public class MaximumNumber2 {
	 static int number1;
	static boolean isMaximum(int number2) {
		boolean result = false;
		if(number1 < number2) {
			result = true;
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		MaximumNumber2.number1 = 500;
		//System.out.println("1st Number is = " + MaximumNumber2.number1 );
		//MaximumNumber2.isMaximum(1);
		System.out.println("Result is = " + MaximumNumber2.isMaximum(500));
		
		
		
	}
	

}
