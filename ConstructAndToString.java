package homeWork15022021;

public class ConstructAndToString {
	String studentName;
	int studentRollNo;
	int studentAge;
	int studentMarks;
	
	
	
	
	public  ConstructAndToString(String studentName, int studentRollNo, int studentAge, int studentMarks) {
		super();
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
	}




	public static void main(String[] args) {
		ConstructAndToString o1 = new ConstructAndToString("Shubham Sokashe" , 153517 , 25 , 83);
		System.out.println(o1.toString());
		
		
		
	}




	@Override
	public String toString() {
		return "Student Details \n Student Name =" + studentName + ",  \n Student Roll No. =" + studentRollNo + ",\n Student Age ="
				+ studentAge + ",\n Student Marks =" + studentMarks + "";
	}

}
