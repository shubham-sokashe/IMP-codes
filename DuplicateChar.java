package StringInteviewQuestions;

// find count of characters from string

import java.util.Arrays;

public class DuplicateChar {
	
	//method to find duplicate character
	public static void checkDuplicate(String str) {
		if(null != str && !str.trim().isEmpty()) {
			str = str.replace(" ", "").toLowerCase();
			char [] strArray = str.toCharArray();
			 Arrays.sort(strArray);
			 for(int j = 0 ; j<strArray.length ; j++) {
				 int count =0;
				 for(int k =0 ; k<strArray.length; k++) {
					 if(strArray[j] == strArray[k]) {
						 count ++;
					 }
					
				 }
				if(j == strArray.length-1) {
					 System.out.println("Given String has \'" + strArray[j] + "\' : " + count + " times." );
				}
				else if(strArray[j] != strArray[j+1]) {
					 System.out.println("Given String has \'" + strArray[j] + "\' : " + count + " times." );
				 }
				 
			 }
				 
		}
		else {
			System.out.println("Invalid string.");
		}
	}

	
	public static void main(String[] args) {
		checkDuplicate("live in javA");
	}

}
