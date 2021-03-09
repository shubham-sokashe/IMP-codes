package com.programmimgWing.hw1802021;

public class OddEvenNumber2 {
	
	int[] numeberArray = new int[101];
	int[] evenNoArray1 = new int[51];
	int[] oddNoArray1 = new int[50];

	void arrayInitialization() {
		for (int i = 0; i < numeberArray.length; i++) {
			numeberArray[i] = i;
		}
	}

	int[] evenArray(int[] array) {

		int arrayIndexNumber = 0;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				evenNoArray1[arrayIndexNumber] = i;
				arrayIndexNumber++;
			}
		}
		return evenNoArray1;

	}
	
	int [] oddArray(int[] array) {

		int arrayIndexNumber = 0;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				oddNoArray1[arrayIndexNumber] = i;
				arrayIndexNumber++;
			}

		}
		
		return oddNoArray1;
	}

	void printOddNumberArray(int [] array) {
		System.out.print("Odd Number Array : ");
		for(int i=1 ; i<array.length ; i++) {
			System.out.print(array[i] + ", ");
		}
	}
	
	
	void printEvenNumberArray(int [] array) {
		System.out.print("\nEven Number Array : ");
		for(int i=1; i<array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	public static void main(String[] args) {
		OddEvenNumber2 object1 = new OddEvenNumber2();
		object1.printOddNumberArray(object1.oddArray(object1.numeberArray));
		object1.printEvenNumberArray(object1.evenArray(object1.numeberArray));
		
	}

}
