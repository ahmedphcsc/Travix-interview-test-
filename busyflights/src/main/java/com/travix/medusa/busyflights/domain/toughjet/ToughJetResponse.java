package com.travix.medusa.busyflights.domain.toughjet;

import java.math.BigDecimal;
import java.util.Date;

public class ToughJetResponse {
	
	
	String carrier 	; //Name of the Airline
	BigDecimal basePrice 	; //Price without tax(doesn't include discount)
	BigDecimal tax 	; //Tax which needs to be charged along with the price
	BigDecimal discount ; //	Discount which needs to be applied on the price(in percentage)
	String departureAirportName ; //	3 letter IATA code(eg. LHR, AMS)
	String arrivalAirportName 	; //3 letter IATA code(eg. LHR, AMS)
	Date outboundDateTime 	; //ISO_INSTANT format
	Date inboundDateTime 	; //ISO_INSTANT format
	
	
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public BigDecimal getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}
	public BigDecimal getTax() {
		return tax;
	}
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public String getDepartureAirportName() {
		return departureAirportName;
	}
	public void setDepartureAirportName(String departureAirportName) {
		this.departureAirportName = departureAirportName;
	}
	public String getArrivalAirportName() {
		return arrivalAirportName;
	}
	public void setArrivalAirportName(String arrivalAirportName) {
		this.arrivalAirportName = arrivalAirportName;
	}
	public Date getOutboundDateTime() {
		return outboundDateTime;
	}
	public void setOutboundDateTime(Date outboundDateTime) {
		this.outboundDateTime = outboundDateTime;
	}
	public Date getInboundDateTime() {
		return inboundDateTime;
	}
	public void setInboundDateTime(Date inboundDateTime) {
		this.inboundDateTime = inboundDateTime;
	}

	

}
