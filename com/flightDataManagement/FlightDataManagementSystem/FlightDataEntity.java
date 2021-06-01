package com.flightDataManagement.FlightDataManagementSystem;

import java.sql.Time;
public class FlightDataEntity {
	
	String flightID;
	String airLine;
	String flightSource;
	String flightDestination;
	Time flightDepartureTime;
	Time flightArrivalTime;
	Time flightIdleTime;
	
	public String getFlightID() {
		return flightID;
	}
	public String getAirLine() {
		return airLine;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public Time getFlightDepartureTime() {
		return flightDepartureTime;
	}
	public Time getFlightArrivalTime() {
		return flightArrivalTime;
	}
	public Time getFlightIdleTime() {
		return flightIdleTime;
	}
	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}
	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}
	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	public void setFlightDepartureTime(Time flightDepartureTime) {
		this.flightDepartureTime = flightDepartureTime;
	}
	public void setFlightArrivalTime(Time flightArrivalTime) {
		this.flightArrivalTime = flightArrivalTime;
	}
	public void setFlightIdleTime(Time flightIdleTime) {
		this.flightIdleTime = flightIdleTime;
	}
	
	@Override
	public String toString() {
		return "\n\n<----Flight Data ---->\n flight ID = " + flightID + "\n Air Line = " + airLine + "\n Flight Source= " + flightSource
				+ "\n Flight Destination = " + flightDestination + "\n Flight Departure Time = " + flightDepartureTime
				+ "\n Flight Arrival Time = " + flightArrivalTime + "\n Flight Idle Time = " + flightIdleTime + "";
	}
	
	
}
