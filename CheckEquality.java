package ArraysQuestions;


import java.util.Arrays;


// code for check equality of two arrays


public class CheckEquality {
	
	static int [] firstArray = {11, 25, 0, -10, 500};
	static int []  secondArray = {500 , 25 , -10 ,0, 11};
	
	
	
	// method to check eqality of two array using Arrays sort() method
	public static boolean isArrayEquals(int[] reference , int[]  tocheck) {
		boolean result = true;
		if(reference.length == tocheck.length) {
			Arrays.sort(reference);
			Arrays.sort(tocheck);
			for(int i=0 ; i< reference.length ; i++) {
				if(reference[i] == tocheck[i]) {
					result = true;
				}
				else {
					result = false;
					break;
				}
			}
		}
		else {
			System.out.println("The length of array is not equal");
			result = false;
		}
		return result;
	}
	
//	------------------------------------------------------------------------------------------------------------------------------------------------
	
	// method using Arrays class equals method
	public static boolean isEqualUsingArrayEquals(int [] reference  , int [] tocheck) {
		boolean result = true;
		if(reference.length == tocheck.length) {
			Arrays.sort(reference);
			Arrays.sort(tocheck);
			result = Arrays.equals(reference, tocheck);
		}
		
		else {
			System.out.println("The length of array is not equal");
			result = false;
		}
		
		return result;
	}
	
//	------------------------------------------------------------------------------------------------------------------------------------------------	
	
	public static void main(String[] args) {
		System.out.println("Is given arrays are equal : " + isArrayEquals(firstArray , secondArray));
		System.out.println("Is given arrays are equal : " + isEqualUsingArrayEquals(firstArray , secondArray));
		
	}
	
}
