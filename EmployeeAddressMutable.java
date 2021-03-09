package com.ImmutableEmployeeClass;

public class EmployeeAddressMutable {
	
	private String City;
	private String Area;
	private int PinCode;
	
	public void setCity(String city) {
		this.City =  city;
	}
	
	public void setArea(String Area) {
		this.Area = Area;
	}
	
	public void setPinCode(int pincode) {
		this.PinCode = pincode;
	}
	
	
	public String getCity() {
		return City;
	}
	
	public String getArea() {
		return Area;
	}
	
	public int getPinCode() {
		return PinCode;
	}

}
