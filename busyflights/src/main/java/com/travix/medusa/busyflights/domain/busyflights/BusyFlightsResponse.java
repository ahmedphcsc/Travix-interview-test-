package com.travix.medusa.busyflights.domain.busyflights;

import java.util.Date;

public class BusyFlightsResponse {
	
	
	String airline 	; // Name of Airline
	String supplier ; //	Eg: CrazyAir or ToughJet
	Long fare 	; //Total price rounded to 2 decimals
	String departureAirportCode ; //	3 letter IATA code(eg. LHR, AMS)
	String destinationAirportCode ; //	3 letter IATA code(eg. LHR, AMS)
	Date departureDate ; //	ISO_DATE_TIME format
	Date arrivalDate 	; //ISO_DATE_TIME format
	
	
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public Long getFare() {
		return fare;
	}
	public void setFare(Long fare) {
		this.fare = fare;
	}
	public String getDepartureAirportCode() {
		return departureAirportCode;
	}
	public void setDepartureAirportCode(String departureAirportCode) {
		this.departureAirportCode = departureAirportCode;
	}
	public String getDestinationAirportCode() {
		return destinationAirportCode;
	}
	public void setDestinationAirportCode(String destinationAirportCode) {
		this.destinationAirportCode = destinationAirportCode;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	

}
