package homeWork15022021;

public class GetterSetterMethod {
	 String studentName;
	 int studentAge;
	int studentMarks;
	
	

	public  String getStudentName() {
		return studentName;
	}



	public   void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public int getStudentAge() {
		return studentAge;
	}



	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}



	public int getStudentMarks() {
		return studentMarks;
	}



	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}



	public static void main(String[] args) {
		GetterSetterMethod student1 = new GetterSetterMethod();
		student1.setStudentName("Shubham Sokashe.");
		System.out.println("Student Name = " + student1.getStudentName());
		student1.setStudentAge(25);
		System.out.println("Student Age = " + student1.getStudentAge() + " Years.");
		student1.setStudentMarks(88);
		System.out.println("Student Marks = " + student1.getStudentMarks());

		GetterSetterMethod student2 = new GetterSetterMethod();
		student2.setStudentName("Bruce Wyane.");
		student2.setStudentAge(20);
		student2.setStudentMarks(70);
		System.out.println("Student Name = " + student2.getStudentName());
		System.out.println("Student Age = " + student2.getStudentAge() + " Years.");
		System.out.println("Student Marks = " + student2.getStudentMarks());
	}

}
