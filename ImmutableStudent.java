package com.immutableClass;

public  final class ImmutableStudent {
	private final String studentName;
	private final int studentRollNo;
	private final StudentAge studentAge;
	
	public ImmutableStudent(String name, int rollno, StudentAge age) {
		this.studentName = name;
		this.studentRollNo = rollno;
		StudentAge copyAge = new StudentAge();
		copyAge.setDay(age.getDay());
		copyAge.setMonth(age.getMonth());
		copyAge.setYear(age.getYear());
		
		this.studentAge = copyAge;
		
	}
	
	public String getStudenName() { return studentName;}
	
	public int getStudentRollNo() { return studentRollNo;}
	
	public StudentAge getStudentAge() {
		
		StudentAge copyAge = new StudentAge();
	
		copyAge.setDay(this.studentAge.getDay());
		copyAge.setMonth(studentAge.getMonth());
		copyAge.setYear(studentAge.getYear());
		return copyAge;
		}
	
	
}
