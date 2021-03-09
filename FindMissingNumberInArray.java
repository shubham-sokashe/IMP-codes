package com.programmimgWing.hw1802021;

public class FindMissingNumberInArray {

	static int[] numberArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	static int toFindMissingNo(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];

		}
		System.out.println("Sum of Array = " + sum);
		return  55 - sum;

	}

	public static void main(String[] args) {
		numberArray[4] = 0;
		System.out.print("Missing Number from array = " + toFindMissingNo(numberArray));

	}

}
