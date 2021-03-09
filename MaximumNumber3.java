package homeWork14022021;

//write a java program which accepts two numbers and in result it should give maximum number
// using math.max() method from math.class 

public class MaximumNumber3 {
	
	static int number1;
	static int number2;

	public static void main(String[] args) {

		MaximumNumber3.number1 = 0;
		MaximumNumber3.number2 = 0275;
		System.out.println("first Number is = " + MaximumNumber3.number1);
		System.out.println("Second Number is = " + MaximumNumber3.number2);
		System.out.println( "Maximum Number is = " + Math.max(number1, number2));
		
	}

}
