package com.Interview.PrivateConstructor;

public class College {

	public static void main(String[] args) {
		
	// 	StudentInfo student1 = new StudentInfo();   cannot create object like this 
		
		// so to create object of that class we have write a method in that class which initalize the constrctor and returns the object of that class
		
		// we have written getConstructor(); method
		
		StudentInfo student1 = StudentInfo.getConstructor(1 , "shubham"); // here we have initalized private fields
		
		// to get private fields we have to write getter into that class
		
		
		System.out.println("Student roll no :" + student1.getRollNo());
		System.out.println("Student Name : " + student1.getName());
		
	}

}
