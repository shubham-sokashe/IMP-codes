package StringInteviewQuestions;

public class CheckDigitsInString {
	
	// code to check string contain only int values
	
	
	// method using regex
	public static void hasInt(String str) {
		if((null != str) && (!str.trim().isEmpty())) {
			if(str.matches("[0-9]+")) {
				System.out.println("String contains only digits");
			}
			else {
				System.out.println("String doesnt contains completely digits.");
			}
			
		}
		else {
			System.out.println("Please enter valid string.");
		}
	}
	
	// method using character wrapper class
	public static void hasIntWrapper(String str) {
		if((null != str) && (!str.trim().isEmpty())) {
			int indexVal = 0;
				 char ch = str.charAt(indexVal) ;
				if((indexVal == str.length()-1) && Character.isDigit(ch)) {
					System.out.println("String contains only digits");
				}
				else if(Character.isDigit(ch)) {
					indexVal ++ ;
				}
				else {
					System.out.println("String doesnt contains completely digits.");
					
				}
			
		}
		else {
			System.out.println("Please enter valid string.");
		}
	}

	public static void main(String[] args) {
		hasInt("8806010156");
		hasIntWrapper("1111");
	}

}
