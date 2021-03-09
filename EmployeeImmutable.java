package com.ImmutableEmployeeClass;

// immutable class of Employee

public final class EmployeeImmutable {
	
	
	private final int EmployeeId;
	private final String EmployeeName;
	private final EmployeeAddressMutable EmployeeAddress;
	
	public EmployeeImmutable(String name , int id ,EmployeeAddressMutable  Address) {
		this.EmployeeName = name;
		this.EmployeeId = id;
		
		EmployeeAddressMutable copyAddress = new EmployeeAddressMutable();
		copyAddress.setCity(Address.getCity());
		copyAddress.setArea(Address.getArea());
		copyAddress.setPinCode(Address.getPinCode());
		
		this.EmployeeAddress = copyAddress;
	}
	
	
	public String getEmployeeName() {
		return EmployeeName;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}
	
	
	public EmployeeAddressMutable getEmployeeAddress() {
		
		EmployeeAddressMutable copyAddress = new EmployeeAddressMutable(); 
		copyAddress.setCity(this.EmployeeAddress.getCity());
		copyAddress.setArea(this.EmployeeAddress.getArea());
		copyAddress.setPinCode(EmployeeAddress.getPinCode());
		
		
		return copyAddress;
	}
}
