package com.ImmutableEmployeeClass;

public class TestImmutability {

	public static void main(String[] args) {
		
		EmployeeAddressMutable emplyee1Address = new EmployeeAddressMutable();
		emplyee1Address.setCity("Pune");
		emplyee1Address.setArea("Katraj");
		emplyee1Address.setPinCode(4110046);
		
		
		EmployeeImmutable employee1 = new EmployeeImmutable("john" , 2 , emplyee1Address);
		
		System.out.println("Details of Employee Before Modification:");
		System.out.println("Employee Name : " + employee1.getEmployeeName());
		System.out.println("Employee Id : " + employee1.getEmployeeId());
		System.out.println("Employee Address: ");
		System.out.print("City : " + employee1.getEmployeeAddress().getCity());
		System.out.print("\tArea : " + employee1.getEmployeeAddress().getArea());
		System.out.println("\tPin Code : " + employee1.getEmployeeAddress().getPinCode());
		
		// test for modification------------------------------------------------------------------------
		System.out.println("\n--------------------------------------------------------------------------------------------------------------");
		
		emplyee1Address.setCity("Ichalkaranji");
		emplyee1Address.setArea("Gandhi Chowk");
		emplyee1Address.setPinCode(416115);
		
		//-------------------------------
		
		employee1.getEmployeeAddress().setCity("Ichalkaranji");
		employee1.getEmployeeAddress().setArea("Gandhi Chowk");
		employee1.getEmployeeAddress().setPinCode(416115);
		
		
		System.out.println("\nDetails of Employee After Modification:");
		System.out.println("Employee Name : " + employee1.getEmployeeName());
		System.out.println("Employee Id : " + employee1.getEmployeeId());
		System.out.println("Employee Address: ");
		System.out.print("City : " + employee1.getEmployeeAddress().getCity());
		System.out.print("\tArea : " + employee1.getEmployeeAddress().getArea());
		System.out.print("\tPin Code : " + employee1.getEmployeeAddress().getPinCode());
		
		
	}

}
