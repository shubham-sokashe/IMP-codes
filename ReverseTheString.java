package StringInteviewQuestions;


// code has methods to reverse the given string


public class ReverseTheString  {

	// null check 
	private static boolean checkForInvalidString(String str) {
		if ((null != str) && (str.trim().isEmpty())) { 
			return false;
			}
		else {
			return true;
			}
	}

	
	// using StringBuffer
	public static String reverseStringUsingBuffer(String str) {
		if(checkForInvalidString(str)) {
			if(str.trim().length()== 1) {
				return "Enterd only one character" ;
			}
			else {
				StringBuffer s1 = new StringBuffer(str);
				 return s1.reverse().toString();
			}
			
		}
		else {
			return "Please enter valid string.";
		}

	}
	
	// using StringBuilder
	public static String reverseStringUsingBuilder(String str) {
		if(checkForInvalidString(str)) {
			if(str.trim().length()== 1) {
				return "Enterd only one character" ;
			}
			else {
				StringBuffer s1 = new StringBuffer(str);
				 return s1.reverse().toString();
			}
			
		}
		else {
			return "Please enter valid string.";
		}

	}
	
	// Iterating in for loop using CharAt(); method
	
	public static String reverseStringUsingCharAt(String str) {
		
		if(checkForInvalidString(str)) {
			if(str.trim().length()== 1) {
				return "Enterd only one character" ;
			}
			else {
				char [] reverse =  new char [str.length()];
				int indexNo =0;
				for(int i = str.length()-1 ; i>=0; i--) {
					reverse[indexNo++]= str.charAt(i);
				}
				String result = String.valueOf(reverse); //Arrays.toString(reverse)
				return result ;
			}
			
		}
		else {
			return "Please enter valid string.";
		}

	}
		
	// Iterating in for loop using toCharArray(); method	
	
	public static String reverseStringUsingToCharArray(String str) {
		if(checkForInvalidString(str)) {
			if(str.trim().length()== 1) {
				return "Enterd only one character" ;
			}
			else {
				char [] original = str.toCharArray();
				char [] reverse =  new char [original.length];
				int indexNo =0;
				for(int i = original.length-1 ; i>=0; i--) {
					reverse[indexNo++]= original[i];
				}
				String result = String.valueOf(reverse); //Arrays.toString(reverse)
				return result ;
			}
			
		}
		else {
			return "Please enter valid string.";
		}
		
	}
	
	
	// using recursion
	public static String reverseStringUsingrecursion(String str) {
		
		if(checkForInvalidString(str)) {
			
				if(str.length() < 2){
					return str;
				}
				else {
				return reverseStringUsingrecursion(str.substring(1)) + str.charAt(0);
				}
			
		}
		else {
			return "Please enter valid string.";
		}
		
		
	}
	
	// using collection reverse
	

	
	public static void main(String[] args) {
		System.out.println("String to be reversed : " + "abc");
		System.out.println("Reversed String  using StringBuffer : " + reverseStringUsingBuffer("abc"));
		
		System.out.println("\nString to be reversed : " + "xyz");
		System.out.println("Reversed String  using StringBuilder : " + reverseStringUsingBuilder("xyz"));
		
		System.out.println("\nString to be reversed : " + "pqr");
		System.out.println("Reversed String  using CharAt() method : " + reverseStringUsingCharAt("pqr"));
		
		System.out.println("\nString to be reversed : " + "stu");
		System.out.println("Reversed String  using toCharArray() method : " + reverseStringUsingToCharArray("stu"));
		
		System.out.println("\nString to be reversed : " + "def");
		System.out.println("Reversed String  using  recursion : " + reverseStringUsingrecursion("def"));
	}

}
