package ExampleOfVarArgs;


// in this we will see how to use Varagrs



public class VariableArguments {
	
	public static void sumOfNumbers( int ... nums) {
		System.out.println("No of argumes accepted are : " + nums.length);
		int sum = 0;
		for(int j: nums) {
			sum += j;
		}
		System.out.println("Sum of all Arguments is :" + sum);
		
		System.out.println("Args at index 0 : " + nums[0]);
		System.out.println("Args at index 1 : " + nums[1]);
	}
	
	
	public static void main(String [] args) {
		System.out.println("VarAgrs stands for variable Argument");
		System.out.println("used whne we are not sure about the arguments a method is going to accept");
		System.out.println("\n rules for varagrs");
		System.out.println("1. the VarArgs should be a last");
		System.out.println("2. We cannot define two Argments of VarArgs");
		System.out.println("in Backend Varargs are storeed as array");
		sumOfNumbers(0, 1);
		
		
	}
	
	
	
	
	
}
