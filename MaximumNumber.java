package homeWork14022021;

// write a java program which accepts two numbers and in result it should give maximum number

public class MaximumNumber {
	
	static void isMaximum(double number1 , double number2) {
		if(number1 >= number2) {
			System.out.println("maximum number is =" + number1);
		}
		
		else {
			System.out.println("maximum number is = " + number2);
		}
	}
	
	

	public static void main(String[] args) {
		
		MaximumNumber.isMaximum(1.00, 1.0001);
		

	}

}
