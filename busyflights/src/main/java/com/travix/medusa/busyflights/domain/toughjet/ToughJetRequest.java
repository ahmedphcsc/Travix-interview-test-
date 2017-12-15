package com.travix.medusa.busyflights.domain.toughjet;

import java.util.Date;

public class ToughJetRequest {
	
	
	String from 	; //3 letter IATA code(eg. LHR, AMS)
	String to 	; //3 letter IATA code(eg. LHR, AMS)
	Date outboundDate 	; //ISO_LOCAL_DATE format
	Date inboundDate 	; //ISO_LOCAL_DATE format
	int numberOfAdults 	; //Number of passengers
	
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Date getOutboundDate() {
		return outboundDate;
	}
	public void setOutboundDate(Date outboundDate) {
		this.outboundDate = outboundDate;
	}
	public Date getInboundDate() {
		return inboundDate;
	}
	public void setInboundDate(Date inboundDate) {
		this.inboundDate = inboundDate;
	}
	public int getNumberOfAdults() {
		return numberOfAdults;
	}
	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	
	


}
