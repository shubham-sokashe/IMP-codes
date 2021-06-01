package com.flightDataManagement.FlightDataManagementSystem;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


public class FlightDataDAO {
	
	private static  SessionFactory factory = null;


	
	// method to get Session factory object
	public static SessionFactory getSessionFactory() {
		if(null == factory) {
		factory = new Configuration().configure().buildSessionFactory();
		return factory;
		}
		else {
			System.err.println("Session Factory object allready created..");
			return factory;
		}
	}
	
	// method to fetch flight data on flight Id
	public FlightDataEntity getFlightDataOnId(String flightId) {
		if((null != flightId) && (null != factory)) {
			if(flightId.startsWith("pl10")) {
				Session session1 = factory.openSession();
				FlightDataEntity dummyFlight = (FlightDataEntity)session1.get(FlightDataEntity.class,flightId);
				return dummyFlight ;
			}
			else {
				System.err.print("Please enter Valid Flight Id");
			}
		}
		else {
			System.err.println("Session Factory object or flight Id is null.");
		}
		return null;
		
	}
	
	// method to close the session factory 
	public static void closeSessionFactory() {
		try{
			factory.close();
			System.out.println("Sesssion factory has been closed.");
		}
		catch(Exception e) {
			System.err.println("Failed to close Session Factory..");
		}
	}
}
