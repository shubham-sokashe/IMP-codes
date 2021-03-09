package homeWork14022021;
//write  a java class to print multiple fields from method

//using constructor and to string() method

public class Example2ToStringMethod {
	String employeeName;
	int employeeId;
	long employeeContactNo;
	String employeeBloodGroup;

	
	public Example2ToStringMethod(String employeeName, int employeeId, long employeeContactNo,
			String employeeBloodGroup) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeContactNo = employeeContactNo;
		this.employeeBloodGroup = employeeBloodGroup;
	}


	
	@Override
	public String toString() {
		return "Employee Details\n[Employee Name =" +  employeeName + ", \n Employee Id =" + employeeId
				+ ",\n Employee Contact No. =" + employeeContactNo + ", \n Employee Blood Group =" + employeeBloodGroup + "]";
	}



	public static void main(String[] args) {
		Example2ToStringMethod object1 = new Example2ToStringMethod("Shubham Sokashe " , 3, 8806010156L, "B+ve");
		System.out.println(object1);
//		System.out.println(object1.toString());

	}

}
