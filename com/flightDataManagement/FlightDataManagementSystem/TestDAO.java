package com.flightDataManagement.FlightDataManagementSystem;

public class TestDAO {

	public static void main(String[] args) {
		FlightDataDAO.getSessionFactory();
		FlightDataEntity flight1 = new FlightDataDAO().getFlightDataOnId("pl101");
		System.out.println(flight1.toString());
		FlightDataDAO.closeSessionFactory();
	}
}
