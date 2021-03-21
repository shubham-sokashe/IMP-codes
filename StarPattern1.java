package PatternPrinting;

// print following star pattern




public class StarPattern1 {
	
	
	public static void printPattern1() {
//	*****
//	*****
//	*****
//	*****
//	*****
		
		int noOfRows = 5;
		int noOfColumns = 5;
		
		for(int i = 0 ; i < noOfRows ; i++) {
			for(int j = 0 ; j < noOfColumns; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
	
//--------------------------------------------------------------------------------------------------------------------------
	
	public static void printPattern2() {
//		*
//		**
//		***
//		****
//		*****
		for(int i = 1 ; i<=5 ; i++) {
			for(int j = 1 ; j<= i ; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
	
//--------------------------------------------------------------------------------------------------------------------------
	
	public static void printPattern3() {
//		*****
//		****
//		***
//		**
//		*
		
		for(int i = 5 ; i>0 ; i--) {
			for(int j = 1 ; j<=i ; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

//--------------------------------------------------------------------------------------------------------------------------
	
	public static void printPattern4() {
//	     *
//	    ** 
//	   ***
//	  ****
//	 *****
		int blankSpace = 5;
		for(int i = 1; i<=5 ; i++) {
			for(int j = blankSpace ; j>0 ; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
			blankSpace--;
		}
	}
	
//--------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	public static void main(String[] args) {
		printPattern1();
		System.out.println("----------------------------------------------------");
		printPattern2();
		System.out.println("----------------------------------------------------");
		printPattern3();
		System.out.println("----------------------------------------------------");
		printPattern4();
		System.out.println("----------------------------------------------------");
		
		
	}

}
