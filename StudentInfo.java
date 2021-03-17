package com.Interview.PrivateConstructor;



// this class contains private constructor
public class StudentInfo {
	
	private int rollNO;
	private String name;
	
	private StudentInfo(int rollno , String name) {
		System.out.println("Inside Students Constructor");
		this.name = name;
		this.rollNO = rollno;
	}

	public  static StudentInfo getConstructor(int roll , String nme) {
		StudentInfo stu1 = new StudentInfo(roll , nme);
		return stu1;
		
		
	}
	
	
	public int getRollNo() {
		return this.rollNO;
	}
	
	public String getName() {
		return this.name;
	}
}
