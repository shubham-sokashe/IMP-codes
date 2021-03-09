package com.programmimgWing.hw1702021;

public class Vehicle {
	String make;
	String type;
	int cc;
	double horsePower;
	String color;
	double torque;
	int speed;
	
	public Vehicle(String mke , String typ , int cc,String clr, double trq, int spd){
		super();
		this.make = mke;
		this.type = typ;
		this.cc = cc;
		this.color = clr;
		this.torque = trq;
		this.speed = spd;
		
	
	}
	
	public double hpCalculate(){
	 horsePower = (torque * speed)/5252;
	 return horsePower;
	
	}
	

	public void vehicalDetails(Vehicle A){
		System.out.println("Vehicle make - " + A.make);
		System.out.println("Vehicle Type - " + A.type);
		System.out.println("Vehicle cc - " + A.cc + "cc.");
		System.out.println("Vehicle Color - " + A.color);
		System.out.println("Vehicle Torque - " + A.torque + " Nm.");
		System.out.println("Vehicle Speed - " + A.speed + " rpm.");
		System.out.println("Vehicle HorsePower - " + A.hpCalculate() + " hp.");
	
	}
	
	public static void main(String [] args){
		Vehicle cbUnicorn = new Vehicle( "Honda" , " Two Wheeler" , 150 , "Silver-Black", 12.8, 5500);
		cbUnicorn.vehicalDetails(cbUnicorn);
		
		System.out.println("--------------------------------------------------------------------");
		
		Vehicle cbShine = new Vehicle("Honda" , "Two Wheeler" , 125 ,"Maroon", 11 , 6000);
		cbShine.vehicalDetails(cbShine);
		
		System.out.println("--------------------------------------------------------------------");
	
	}

	
	

}
