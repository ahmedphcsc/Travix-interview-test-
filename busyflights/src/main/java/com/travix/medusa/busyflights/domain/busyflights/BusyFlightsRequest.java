package com.travix.medusa.busyflights.domain.busyflights;

import java.util.Date;

public class BusyFlightsRequest {
	
	
	String origin 	; // 3 letter IATA code(eg. LHR, AMS)
	String destination ; // 	3 letter IATA code(eg. LHR, AMS)
	Date departureDate 	; // ISO_LOCAL_DATE format
	Date returnDate 	; // ISO_LOCAL_DATE format
	int numberOfPassengers 	; // Maximum 4 passengers
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	

}
