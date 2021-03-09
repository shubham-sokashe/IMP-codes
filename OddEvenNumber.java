package com.programmimgWing.hw1802021;

//Sort out even and odd numbers from array of 1 to 100.

public class OddEvenNumber {

	int[] numeberArray = new int[101];

	int[] arrayInitialization() {
		for (int i = 0; i < numeberArray.length; i++) {
			numeberArray[i] = i;
		}

		return numeberArray;

	}

	void evenOddNumber(int[] Arr) {
		System.out.print("Even Numbers  are - ");
		for (int j = 1; j < Arr.length; j++) {

			if (j % 2 == 0) {
				System.out.print(j + " ");
			}

		}

		System.out.print("\nodd Numbers  are - ");
		for (int k = 0; k < Arr.length; k++) {

			if (k % 2 != 0) {
				System.out.print(k + " ");
			}

		}

	}

	public static void main(String[] args) {
		OddEvenNumber sort = new OddEvenNumber();
		sort.evenOddNumber(sort.numeberArray);

	}

}
