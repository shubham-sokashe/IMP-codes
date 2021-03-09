package homeWork14022021;

// write  a java class to print multiple fields from method

public class Example2 {
	String employeeName;
	int employeeId;
	long employeeContactNo;
	String employeeBloodGroup;

	 void employeeDetails() {
		Example2 object1 = new Example2();
		object1.employeeName = "Shubham Sokashe";
		object1.employeeId = 3;
		object1.employeeContactNo = 8806010156L;
		object1.employeeBloodGroup = "B+ve";
		System.out.println("Employee name = " + object1.employeeName);
		System.out.println("Employee id = " + object1.employeeId);
		System.out.println("Employee Contact Number = " + object1.employeeContactNo);
		System.out.println("Employee Blood Group = " + object1.employeeBloodGroup);
		
	}

	public static void main(String[] args) {
		Example2 methodObject1 = new Example2();
		methodObject1.employeeDetails();

	}

}
