package com.Interview.demo;

public class SecondChildClass  extends ChildClass{
	
	
	public static void method1() {
		System.out.println("Inside method1 of Second Child Class.");
	}

	public void method2() {
		System.out.println("Inside method2 of Second Child Class.");
		
	}

	

	public static void main(String[] args) {
		
		System.out.println("Inside main method of Second Child Class. \n");
		SecondChildClass obj1 = new SecondChildClass();
		ChildClass.method1();
		obj1.method2();
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("\nWe will create object of second child class with refrence of child class\n");
		
		ChildClass child1 = new SecondChildClass();
		//ChildClass.method1();
		child1.method2();

	}

}
