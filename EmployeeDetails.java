package CustomComparator;

public class EmployeeDetails implements Comparable<EmployeeDetails> {
	
	private int EmployeeId ;
	private String EmloyeeName;
	private String EmployeeAddress;
	
	
	public EmployeeDetails(int id , String name , String address) {
		this.EmployeeId = id;
		this.EmloyeeName = name;
		this.EmployeeAddress = address;
	}
	
	
	public int getEmployeeId() {
		return this.EmployeeId;
	}
	
	public String getEmployeeName() {
		return this.EmloyeeName;
	}
	
	public String getEmployeeAddress() {
		return this.EmployeeAddress;
	}

	@Override
	public int compareTo(EmployeeDetails o) {
		return this.EmloyeeName.compareTo(o.EmloyeeName);
	}


	@Override
	public String toString() {
		return "\n EmployeeId= " + EmployeeId + " \tEmloyeeName= " + EmloyeeName + " \tEmployeeAddress= "
				+ EmployeeAddress + "\n";
	}
	
	
	
}
