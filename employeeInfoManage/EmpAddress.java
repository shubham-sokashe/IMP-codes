package employeeInfoManage;

public class EmpAddress {
	

	private String country;
	private String state;
	private String buildingName;
	private int pinCode;
	
	
	
	public EmpAddress() {
		
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setBuildingName(String bName) {
		this.buildingName = bName;
		
	}
	
	public void setPinCode(int pin) {
		this.pinCode = pin;
	}
	
	
	public String getCountry() {
		return this.country;
	}
	
	public String getState() {
		return this.state;
	}
	
	public String getBuildingName() {
		return this.buildingName;
	}
	
	public int getPinCode() {
		return this.pinCode;
	}

	@Override
	public String toString() {
		return "Employee Address: \t [country =  " + country + ", state =  " + state + ", buildingName =  " + buildingName + ", pinCode =  "
				+ pinCode + "]\n";
	}

}
