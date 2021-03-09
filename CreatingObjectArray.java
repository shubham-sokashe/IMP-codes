package com.programmimgWing.hw1902021;


public class CreatingObjectArray {
	
	Object [] Personnel = new Object[8] ;
	
	void personnelDirectory() {
		Student student1 = new Student("Shubham" , 9 , 70);
		Student student2 = new Student("Akshay" , 1 , 30);
		Student student3 = new Student("Aniket" , 3 , 80);
		Student student4 = new Student("Sushil" , 2 , 10);
		
		Personnel[0] = student1;
		Personnel[1] = student2;
		Personnel[2] = student3;
		Personnel[3] = student4;

		
	}


	public static void main(String[] args) {
		CreatingObjectArray object1 = new CreatingObjectArray();
		object1.personnelDirectory();
		for(int i=0; i<object1.Personnel.length; i++) {
			if(object1.Personnel[i] instanceof Student) {
				Student objectStudent = new Student();
				objectStudent = (Student) object1.Personnel[i];
				if(objectStudent.studentMarks < 40) {
					System.out.println("Student who has less than 40 marks: " + objectStudent.studentName);
				}

			}
			
		}
		
		
	}


	
}



// -------------------------------------------------------------------------------------------------------------------------------------------------------------------

class Student{
	String studentName;
	int studentRollNo;
	int studentMarks;
	public Student(String sname, int srollno , int smarks) {
		this.studentName = sname;
		this.studentRollNo = srollno;
		this.studentMarks = smarks;
		
	}
	public Student() {
		super();
	}
	
}

