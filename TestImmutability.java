package com.immutableClass;

public class TestImmutability {
	
	

	public static void main(String[] args) {
		StudentAge studentAge1 = new StudentAge();
		studentAge1.setDay(3);
		studentAge1.setMonth(9);
		studentAge1.setYear(1996);
		
		ImmutableStudent student1 = new ImmutableStudent("Shubham" , 9 , studentAge1);
		System.out.println("Before Modification :\nname = " + student1.getStudenName() + "\t Roll No = " + student1.getStudentRollNo());
		System.out.println("day = " + student1.getStudentAge().getDay());
		System.out.println("month = "  + student1.getStudentAge().getMonth());
		System.out.println("year = " + student1.getStudentAge().getYear());
		
		
		// modification---------------------------------------------------------------------------------------
		
		studentAge1.setDay(4);
		studentAge1.setMonth(5);
		studentAge1.setYear(1990);
		
		student1.getStudentAge().setDay(30);
		student1.getStudentAge().setMonth(12);
		student1.getStudentAge().setYear(2020);
		
		
		System.out.println("\nAfter Modification :");
		System.out.println("day = " + student1.getStudentAge().getDay());
		System.out.println("month = "  + student1.getStudentAge().getMonth());
		System.out.println("year = " + student1.getStudentAge().getYear());
		
		
	}

}
