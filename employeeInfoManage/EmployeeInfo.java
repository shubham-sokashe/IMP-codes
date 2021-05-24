package employeeInfoManage;


// basic Employee Info
public class EmployeeInfo {
	private String empName;
	private int empId;
	private EmpAddress empAddress;
	
	@Override
	public String toString() {
		return "EmployeeInfo [empName =  " + empName + ", empId =  " + empId + ", empAddress =  " + empAddress + "]";
	}

	public EmployeeInfo( int empId, String empName,  String building , String state ,String country , int pin ) {
		super();
		this.empName = empName;
		this.empId = empId;
		EmpAddress emp1 = new EmpAddress();
		emp1.setBuildingName(building);
		emp1.setState(state); 
		emp1.setCountry(country);
		emp1.setPinCode(pin);
		this.empAddress = emp1;
	}
	
	public EmployeeInfo() {
		super();
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	public EmpAddress getEmpAddress() {
		return empAddress;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpAddress(EmpAddress empAddress) {
		this.empAddress = empAddress;
	}
	

}
