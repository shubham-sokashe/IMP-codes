package ArraysQuestions;

// find duplicates from string array

public class FindDuplicates {
	
	static String name[] = {"shubham" , "aniket" , "akshay" , "shubham" , "supdarshan" , " akshay" , "shubham"};
	static String [] duplicate = new String [name.length];
	static int indexno = 0;
	
	// method to find duplicates in string array
	public static void findDuplicate(String [] array){
		if((null != array) && hasnull(array)) {
			System.out.println("inside duplicate check");
			for(int i =0 ; i< array.length ; i++) {
				int count =0 ;
				int indexno = i+1;
				while(indexno < array.length) {
					if(array[i].trim().equalsIgnoreCase(array[indexno].trim())) {
						count++;
					}
					indexno++;
				}
				if(count >= 1) {
					System.out.println("duplicate element is : " + array[i]);
				}
			}
			
		}
		else {
			System.out.println("Please enter valid array.");
		}
		
	}
	
	// method to check that array contains null value
	private static boolean hasnull(String [] ary) {
		boolean result = true ;
		for(int i =0 ; i < ary.length ; i++) {
			if(null == ary[i]) {
				result = false ;
			}
			else {
				result = true;
			}
			
		}
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		findDuplicate(name);
	}

}
