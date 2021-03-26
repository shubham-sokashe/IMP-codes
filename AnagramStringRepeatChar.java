package StringInteviewQuestions;

import java.util.HashMap;

// write code to check string is anagram or not and check it too if any word is repeated; StringBuffer

public class AnagramStringRepeatChar {
	
	//method to count characters in string
	public static HashMap<Character , Integer> countChars(String str) {
		HashMap<Character , Integer> hm1 = new HashMap<>();
		str =str.toLowerCase();
		for(int i = 0 ; i< str.length(); i++) {
			int charCount = 0 ;
			for(int j =0 ; j< str.length() ; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					charCount++;
				}
			}
			hm1.put(str.charAt(i) , charCount);
		}
//		System.out.println("Size of hashmap : " + hm1.size());
//		System.out.println(hm1);
		return hm1;
	}

	
	// method to check anagram
	public static void isAnagram(String str , String anagram) {
		if((null != str) && (null != anagram) && (!str.trim().isEmpty()) && (!anagram.trim().isEmpty())) {
			if(str.trim().length() == anagram.trim().length()) {
				if(str.length() > 1) {
					if(countChars(str).equals(countChars(anagram))) {
						System.out.println(" \nGiven String is anagram.");
					}
					else {
						System.out.println("String is not anagram.");
					}
					
				}
				else {
					System.out.println("String contains only one character, cannot define anagram.");
				}
				
			}
			else {
				System.out.println("String is not anagram.");
			}
			
		}
		else {
			System.out.println("Please enter valid string.");
		}
	}
	public static void main(String[] args) {
		String str = "silent" ;
		String Anagram = "listen";
		System.out.println("first String to compare with : " + "\"" + str + "\"");
		System.out.println("Second String to check anagram : " + "\"" + Anagram + "\"");
		
		isAnagram(str , Anagram);

	}

}
