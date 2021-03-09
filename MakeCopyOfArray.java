package com.programmimgWing.hw1802021;

public class MakeCopyOfArray {

	int[] array1 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
	int[] array2 = new int [array1.length];
	int[] array3 = new int[array1.length];
	
	
	void arrayAssigning() {
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
	}
	
	void decendingArrayAssigning() {
		int array2IndexNo =0;
		for (int i =array1.length-1; i>0 ; i-- ) {
			array3[array2IndexNo] = array1[i];
			array2IndexNo++;
		}
		
	}

	void printArray(int[] array) {
		System.out.print("Array : ");
		for(int i=0 ; i<array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		MakeCopyOfArray object1 = new MakeCopyOfArray();
		object1.arrayAssigning();
		object1.decendingArrayAssigning();
		object1.printArray(object1.array2);
		object1.printArray(object1.array3);
		
	}

}
