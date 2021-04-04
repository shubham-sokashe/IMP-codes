package ArraysQuestions;

// code to find second largest no 

public class FindSecondLargest2 {
	
	static int [] nums = {1, 11, 0, -1, -50, 500, 100 , 499};
	
	// method to find second largest number from array
	
	public static int findSecondLarge(int[] array) {
		int largestno = 0;
		int secondlarge = 0;
		
		if(nums[0] > nums[1]) {
			largestno = nums[0];
			secondlarge = nums[1];
		}
		else {
			largestno = nums[1];
			secondlarge = nums[0];
		}
		
		for(int i = 2 ; i < nums.length ; i++) {
			if(nums[i] > largestno) {
				secondlarge = largestno;
				largestno = nums[i];
			}
			else if((nums[i] < largestno) && (nums[i] > secondlarge)) {
				secondlarge = nums[i];
			}
		}
		
		
		return secondlarge;
	}

	public static void main(String[] args) {
		System.out.println("Second largest number is :" + findSecondLarge(nums));
	}
	
}
