package PatternPrinting;

// print following pattern

//	1 1 1 1 1
//	2 2 2 2 2
//	3 3 3 3 3 
//	4 4 4 4 4
//	5 5 5 5 5

public class NumberPattern1 {

	
	public static void printPattern() {
		int noOfColumns = 5;
		int startNo = 1;
		int lastNo= 5;
		for(int i = 0; i < noOfColumns ; i++) {
			for(int j = 0; j<lastNo; j++) {
				
				System.out.print(startNo + " ");
			}
			startNo++;
			System.out.println("");
		}
		
		
	}
	
	// --------------------------------------------------------------------------------------------
	
	// 5 5 5 5 5 
	// 4 4 4 4 4 
	// 3 3 3 3 3 
	// 2 2 2 2 2
	// 1 1 1 1 1 
	
	
	public static void printPattern2()	{
//		int noOfColumns = 5;
//		int startNo = 0;
//		int lastNo= 5;
		for(int i = 5; i >0  ; i--) {
			for(int j = 0; j<5; j++) {
				
				System.out.print(i + " ");
			}
		//	lastNo--;
			System.out.println("");
		} 
		
		
	}

	
	public static void main(String[] args) {
		printPattern();
		System.out.println("----------------------------------------------------");
		printPattern2();
	}

}
