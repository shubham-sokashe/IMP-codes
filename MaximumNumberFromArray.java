package homeWork14022021;

// print maximum number from array

public class MaximumNumberFromArray {

	int[] numArray = { 1111, 10, 50, 4, 8, 9, 111 }; // here we given an array

	
// method to check highest number from array	
	void maxNoInArray() {

		int maxNumber = 0; // declaired a variable
		MaximumNumberFromArray object1 = new MaximumNumberFromArray();
		for (int i = 0; i < object1.numArray.length; i++) {  // for loop to iterate over array

			maxNumber = Math.max(maxNumber, object1.numArray[i]); // used math.max() method to check highest number and assign it to variable
		}

		System.out.println("Maximum Number from array is = " + maxNumber);

	}

	public static void main(String[] args) {
		
		MaximumNumberFromArray objectMethod1 = new MaximumNumberFromArray();
		objectMethod1.maxNoInArray();
	}

}
