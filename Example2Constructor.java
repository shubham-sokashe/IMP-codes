package homeWork14022021;
//write  a java class to print multiple fields from method

// using Constructor

public class Example2Constructor {
	String employeeName;
	 int employeeId;
	long employeeContactNo;
	String employeeBloodGroup;

	public Example2Constructor(String employeeName, int employeeId, long employeeContactNo, String employeeBloodGroup) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeContactNo = employeeContactNo;
		this.employeeBloodGroup = employeeBloodGroup;
	}

	public Example2Constructor() {

	}

	void employeeDetails() {
		Example2Constructor object1 = new Example2Constructor("Shubham Sokashe", 3, 8806010156L, "B+ve");
		System.out.println("Employee name = " + object1.employeeName);
		System.out.println("Employee Id = " + object1.employeeId);
		System.out.println("Employee Contact = " + object1.employeeContactNo);
		System.out.println("Employee Blood Group = " + object1.employeeBloodGroup);

	}

	public static void main(String[] args) {
		Example2Constructor object2Details = new Example2Constructor();
		object2Details.employeeDetails();

	}

}
