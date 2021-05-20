package dataBaseInteraction;

// class to get set studens info

public class StudentsPOJO {
	int studentId ;
	String studentsFirstName;
	String studentsLastName;
	String studentsGrade;
	
	public StudentsPOJO (int id , String firstname , String lastname ,String grade) {
		this.studentId = id;
		this.studentsFirstName = firstname;
		this.studentsLastName = lastname;
		this.studentsGrade = grade;
	}

	public StudentsPOJO() {
		super();
	}
	
	public void setstudentId(int id) {
		this.studentId = id;
	}
	public void setstudentsFirstName(String firstName) {
		this.studentsFirstName = firstName;
	}
	
	public void setstudentsLastName(String lastName) {
		this.studentsLastName = lastName;
	}
	
	public void setstudentsGrade(String grade) {
		this.studentsGrade = grade;
	}
	public int getstudentId() {
		return this.studentId;
	}
	
	public String getstudentsFirstName() {
		return this.studentsFirstName;
	}
	
	public String getstudentsLastName() {
		return this.studentsLastName;
		
	}
	
	public String getstudentsGrade() {
		return this.studentsGrade;
	}

	@Override
	public String toString() {
		return " [Id=  " + this.studentId + ", First Name =  " + this.studentsFirstName
				+ ", Last Name =  " + this.studentsLastName + ", Grade =  " + this.studentsGrade + "]";
	}
	
}
