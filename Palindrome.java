package StringInteviewQuestions;

// check given string is palindrome or not
public class Palindrome {

	// method to check palindrome
	public static void isPalindrome(String str) {

		if ((null != str) && (!str.trim().isEmpty())) {               			  // check invalid string

			if (str.contains(" ")) {                                  			 // check string contains white spaces in it
				System.out.println("String contains white spaces");
			} 
			else if (str.trim().length() > 1) {                     		  // check for length more than one char
				int lastChar = str.length() - 1;
				for (int i = 0; i < str.length() - 1; i++) {
					if (i == lastChar) {							  		 //  break the loop when reaches to middle character
						System.out.println("Given String is Palindrome");
						break;
					} 
					else if (str.charAt(i) == str.charAt(lastChar)) {
						lastChar--;

					} 
					else {
						System.out.println("String is not Palindrome.");
						break;
					}

				}
			} 
			else {															// check for only single character entered
				System.out.println("Enterd only one character.");
			}
		} else {
			System.out.println("Please enter valid string");
		}
	}

	
	// using stringbuffer
	public static void isPalindromeUsingBuffer(String str) {
		StringBuffer sb1 = new StringBuffer(str).reverse();
		String reverse = sb1.toString();
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println("Given String is Palindrome");
		}
		 else {
				System.out.println("String is not Palindrome.");
			}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Entered String is  : " + "radar");
		isPalindrome("radar");
		isPalindromeUsingBuffer("abc");
	}

}
