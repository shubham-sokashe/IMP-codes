package com.programmimgWing.hw1902021;

public class SortingOfArray {
	static int [] Array1 = {10, 4, 60, 20, 50, 80, 100, 0, 1};
	int [] sortedArray =  new int [Array1.length];
	
	void AscendingSorting(int [] array) {
	/*	int highestValue=0;
		for(int i =0 ; i<array.length ; i++) {
		if(array[i]>= highestValue) {
			highestValue = array[i];
		}
		}
		sortedArray[sortedArray.length-1] = highestValue;
	}
*/
		
		int highestNo =0;
		int arrayIndexNo = array.length-1;
		for(int j=arrayIndexNo; j>=0;j--) {
			if(array[j] >= highestNo) {
				highestNo = array[j];
			}
		}
		sortedArray[sortedArray.length-1] = highestNo;
		arrayIndexNo--;
			
		}
	public static void main(String[] args) {

		
		
	}

}
