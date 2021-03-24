package StringInteviewQuestions;

import java.util.Arrays;

// check counts of vowels in the string
public class VowelInString {

	
	// method to check vowels
	public static void checkVowels(String str) {
		if(null != str && (!str.trim().isEmpty())) { // check invalid string
		char [] strArray = str.toLowerCase().replace(" " , "").toCharArray();
		Arrays.sort(strArray);
	
		int countOfa = 0;
		int countOfe = 0;
		int countOfi = 0;
		int countOfo = 0;
	    int countOfu = 0;
		
		
		for(int i=0 ; i<strArray.length ; i++) {
			
			switch(strArray[i]) {
			case 'a' :
				countOfa++ ;
				break;
			case 'e' :
				countOfe++ ; 
				break;
			case 'i' :
				countOfi++ ;
				break;
			case 'o' :
				countOfo++ ;
				break;
			case 'u' :
				countOfu++ ;
					break;
			default:
				break;
				
			}
		}
		System.out.println("String containt vowel 'a' : " + countOfa + " times.");
		System.out.println("String containt vowel 'e' : " + countOfe + " times.");
		System.out.println("String containt vowel 'i' : " + countOfi + " times.");
		System.out.println("String containt vowel 'o' : " + countOfo + " times.");
		System.out.println("String containt vowel 'u' : " + countOfu + " times.");
	}
		else {
			System.out.println("Please enter valid string.");
		}
	}
	public static void main(String[] args) {
		checkVowels("Abc");

	}

}
