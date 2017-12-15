package com.travix.medusa.busyflights.domain.crazyair;

import java.util.Date;

public class CrazyAirResponse {
	
	
	String airline 	; // Name of Airline
	Long price 	; //Total price rounded to 2 decimals
	String cabinclass 	; //E for Economy and B for Business
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
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getCabinclass() {
		return cabinclass;
	}
	public void setCabinclass(String cabinclass) {
		this.cabinclass = cabinclass;
	}

	

}
