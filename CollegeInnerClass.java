package innerClasses.demo;

public class CollegeInnerClass {
	
	
	final static String collegename = "ABC college of Engineering.";
	static CollegeInnerClass clg1 = new CollegeInnerClass();
	
// interface for subject
	interface Subjects{
		public String subjectName();
	}

//----------------------------------------------------------------------
	
	// inner class of student
	 class Student{
		
		 private int studentRollNO ;
		 private String studentName ;
		
		Student(int sid , String sname){
			this.studentRollNO = sid ;
			this.studentName = sname;
		}
		
		
		public  int getStudentRollNo() {
			return this.studentRollNO;
		}
		
		public String getStudentName() {
			return this.studentName;
		}
		
		
	}
//----------------------------------------------------------------------
	
	// inner class of teacher
	private class Teacher implements Subjects{
		private int teacherId;
		private String teacherName;
		
		private void setTeacherId(int id) {
			this.teacherId = id;
		}
		
		private void setTeacherName(String name) {
			this.teacherName = name;
		}
		
		
		
		private	String getSubjectName() {
			Subjects sub1 = new Subjects() {// Annonymous class
				@Override
				public String subjectName() {
					return "Applied Mechanics";
				}  
				
			};
			return sub1.subjectName();
		}

		@Override
		public String subjectName() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
//----------------------------------------------------------------------
	
	
	// inner class of Courses
	protected class Courses{
		
		private class Mechanical {
			
			private String subject1 = "Machine Design";
			private String subject2 = "Refrigeration and Air Conditioning";
			private String subject3 = "Theory of Machines";
			
		}
		
		public class Civil {
			private String subject1 = "Structural Design";
			private String subject2 = "Strength of Material";
			private String subject3 = "Geology";
			
		}
	}
	
//----------------------------------------------------------------------	
	
	// method to print Courses
	public static void printCourses() {
		CollegeInnerClass.Courses.Civil c1 = clg1.new Courses () . new Civil();
		System.out.println("Course is : " + "Civil Engineering");
		System.out.println("Subjects are : " +  "\n" + c1.subject1 + "\n" + c1.subject2 + "\n" + c1.subject3);
		System.out.println("-----------------------------------------------------------------");
		
		CollegeInnerClass.Courses.Mechanical m1 = clg1. new Courses() . new Mechanical();
		System.out.println("Course is : " + "Mechanical Engineering");
		System.out.println("Subjects are : " +  "\n" + m1.subject1 + "\n" + m1.subject2 + "\n" + m1.subject3);
	}
	// method to print student info
	public static void printStudentInfo() {
		CollegeInnerClass.Student s1 = clg1.new Student(1 , "shubham");
		System.out.println("College name : " + collegename);
		System.out.println("Student Roll No : " + s1.getStudentRollNo());
		System.out.println("Student Name : " + s1.getStudentName());
	}
	
	// method to print teacher info
	private static void printTeacherInfo() {
		CollegeInnerClass.Teacher t1 = clg1.new Teacher();
		t1.setTeacherId(100);
		t1.setTeacherName("XYZ sir");
		System.out.println("College name : " + collegename);
		System.out.println("Teacher id : " + t1.teacherId);
		System.out.println("Teacher name : " + t1.teacherName);
		System.out.println("Teaches : " + t1.getSubjectName());
		
	}
	
	public static void main(String[] args) {
		printStudentInfo();
		System.out.println("-----------------------------------------------------------------");
		printTeacherInfo();
		System.out.println("-----------------------------------------------------------------");
		printCourses();
	}
}


