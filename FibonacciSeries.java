package interview2202;

import java.util.Scanner;

public class FibonacciSeries {
	static int lastDigit = 0;	
	
	static void printFibonacciSeries() {
		int term1 = 0;
		int term2 = 1;
		int sum;
		for(int i=0; i<=lastDigit; i++) {
			sum = term1 + term2;
			System.out.print(sum + " ");
			term1 = term2;
			term2 = sum;
			
			
		}
		
	}
	

	public static void main(String[] args) {
		System.out.print("Fibonacci Series is: ");
		Scanner input = new Scanner(System.in);
		lastDigit = input.nextInt();
		System.out.print("0 1 ");
		printFibonacciSeries();
		
		input.close();
	}

}
