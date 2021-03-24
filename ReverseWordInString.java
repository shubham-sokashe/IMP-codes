package StringInteviewQuestions;


// reverse every word in string
public class ReverseWordInString {
	
	// method to reverse every word in string
	public static String reverseWord(String str) {
		String reveredString = "";
		StringBuffer reversedWord = new StringBuffer();
		if((null != str) && (!(str.trim().isEmpty()))){
			if(str.trim().length() > 1 ) {
			String [] words = str.split(" ");
			for(int i =0 ; i< words.length ; i++) {
				 reversedWord.append( " " +new StringBuffer(words[i]).reverse()); 
			}
			reveredString = reversedWord.toString();
			return reveredString;
			}
			else {
				return str;
			}
		}
		else {
			 return "please enter valid string";
		}
	}

	public static void main(String[] args) {
		System.out.println("Given String is : " + "live in java" );
		System.out.println("Reversed string is :" +reverseWord("a"));
		
	}

}
