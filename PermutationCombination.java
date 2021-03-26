package StringInteviewQuestions;


// to check permutation and combination
// if ordrer doesnt matter it is combination(selecting things)
// if order matters it  is permutation (its about arranging things)

public class PermutationCombination {
	
	// method to check combination
	public static void getCombination(String str ,  int noOfPlaceToCombine) {
		if((null != str) && (!str.trim().isEmpty()) && (noOfPlaceToCombine >= 0)) {
			if((str.length() > 1) && (!str.contains(" "))) {
				System.out.println();	System.out.println("Combination for given string is :"  + calculateCombination(str , noOfPlaceToCombine));
			}
			else {
					if(str.length() <= 1) {
						System.out.println("String has only one character.");
					}
					else if(str.trim().contains(" ")) {
						System.out.println("Given string containt white space in String");
					}
			}
		}
		else {
			System.out.println("Please enter valid String and Places of characters to find combination.");
		}
	}


	// method to calculate combination of characters in string
	private static int calculateCombination(String str ,int noOfPlaceToCombine) {
		int length = str.length();
		int places = noOfPlaceToCombine;
		int result = (getFactorial(length)) / (getFactorial(places) * getFactorial(length - places));
		return result ;
	}
	
	// method to calculate factorial
	private static int getFactorial(int i) {
		if(i ==1 || i == 0) {
			return 1 ;
		}
		return i * getFactorial(i-1) ;
	}
	
	// method to calculate permutation of characters in string
	public static void GetPermutation(String str ,  int noOfPlaceToCombine) {
		if((null != str) && (!str.trim().isEmpty()) && (noOfPlaceToCombine >= 0)) {
			if(str.length() > 1) {
				System.out.println();	System.out.println("Permutation for given string is :"  + calculatePermutation(str , noOfPlaceToCombine));
			}
			else {
				System.out.println("String has only one character.");
			}
		}
		else {
			System.out.println("Please enter valid String and Places of characters to find combination.");
		}
	}

	
	// method to calculate Permutation of characters in string
		private static int calculatePermutation(String str ,int noOfPlaceToCombine) {
			int length = str.length();
			int places = noOfPlaceToCombine;
			int result = (getFactorial(length)) / ( getFactorial(length - places));
			return result ;
		}
	public static void main(String[] args) {
		System.out.println("Factorial of number : " + getFactorial(0));
		getCombination("12345" , 3);
		GetPermutation("12345" , 3);
	}

}
 