package StringInteviewQuestions;

public class AnagramString {
	
	// Check Anagram of string
	
 // anagram string is string which we can write meaningful string  by shuffling same characters into the given string 
	
	
	// method to check anagram string
	public static void isAnagram(String str , String anagram) {
		if((null != str) && (!str.trim().isEmpty()) && (null != anagram) && (!anagram.trim().isEmpty()) ) {
			str = str.toLowerCase();
			anagram = anagram.toLowerCase();
			if(str.length() == anagram.length()) {
				if((str.length() == 1) && (anagram.length() == 1)) {
					System.out.println("You have entered single character.");
				}
				else {
					System.out.println("Inside anagram check");
					for(int i = 0 ; i < str.length() ; i++) {
						int angramCharcount = 0 ;
						for(int j = 0 ; j < anagram.length() ; j++) {
							if(str.charAt(i) == anagram.charAt(j)) {
								angramCharcount++;
							}
						}
						if(angramCharcount != 1) {
							System.out.println("Strings are not anagram");
							break;
						}
						if(i == (str.length()-1)) {
							System.out.println("String's are anagram");
						}
					}
				}
			}
			else {
				System.out.println("Given String is not anagram.");
			}
		}
		else {
			System.out.println("Please enter valid string.");
		}
	}

	public static void main(String[] args) {
		isAnagram("lisTen" , "silent");
 
	}

}
