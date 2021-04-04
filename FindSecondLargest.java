package ArraysQuestions;

import java.util.Arrays;

// find second largest number in the array


public class FindSecondLargest {
	
	
	private static int []  numbers = {10 , 8 , 20 , 0 , 1 , 100 , 9 , -50 , 50 , 55 ,-1 , -11 };
	
	// method to find second largest number using arrays method
	public static int findsecondlargest(int []  array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		int secondlargest = array[array.length-2];
		return secondlargest;
	}

	
	public static void main(String[] args) {
		System.out.println("Second largest number is : " + findsecondlargest(numbers));
	}
	

}
