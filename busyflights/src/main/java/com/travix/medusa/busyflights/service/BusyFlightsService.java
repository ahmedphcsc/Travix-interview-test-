package com.travix.medusa.busyflights.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;



@Service
public class BusyFlightsService {
	
	public List<BusyFlightsResponse> getFlights(BusyFlightsRequest req){
		List<BusyFlightsResponse> bFRList = new ArrayList<>();
		
		String crazyAirReq = createCrazyAirReq(req);
		HttpResponse crazyAirRes = getSupplierFlights(crazyAirReq, "CrazyAir");
		String toughJetReq = createToughJetReq(req);
		HttpResponse toughJetRes = getSupplierFlights(toughJetReq, "toughJet");
		
		List<CrazyAirResponse> crazyAirResLst = buildCrazyAirRes(crazyAirRes);
		List<ToughJetResponse> toughJetResLst = buildToughJetRes(toughJetRes);
		
		bFRList.addAll(crazyAirToBusyFlights(crazyAirResLst));
		bFRList.addAll(toughJetToBusyFlights(toughJetResLst));
		
		return sortByFare(bFRList);
	}
	
	
	// This Method to sort the Response by Fare
	private List<BusyFlightsResponse> sortByFare(List<BusyFlightsResponse> flights){
		Collections.sort(flights, new Comparator<BusyFlightsResponse>() {
		    @Override
		    public int compare(BusyFlightsResponse f1, BusyFlightsResponse f2) {
		        return f1.getFare().compareTo(f2.getFare());
		    }
		});
		
		return flights;
	}
	
	public List<BusyFlightsResponse> crazyAirToBusyFlights(List<CrazyAirResponse> cList){
		// this to CrazyAirResponse List to BusyFlightsResponse List
		return new ArrayList<>();
	}

	public List<BusyFlightsResponse> toughJetToBusyFlights(List<ToughJetResponse> tlist){
		// this to convert List ToughJetResponse to BusyFlightsResponse List
		return new ArrayList<>();
	}

	public List<CrazyAirResponse> buildCrazyAirRes(HttpResponse response){
		// this to convert respnse to CrazyAirResponse List
		return new ArrayList<>();
	}

	public List<ToughJetResponse> buildToughJetRes(HttpResponse response){
		// this to convert httprespnse to ToughJetResponse List
		return new ArrayList<>();
	}
	
	public String createCrazyAirReq(BusyFlightsRequest req){
		JSONObject item = new JSONObject();
		try {
			item.put("origin", req.getOrigin());
			item.put("destination", req.getDestination());
			item.put("departureDate", req.getDepartureDate() );
			item.put("returnDate", req.getReturnDate());
			item.put("passengerCount", req.getNumberOfPassengers());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return item.toString();
	}
	
	public String createToughJetReq(BusyFlightsRequest req){
		JSONObject item = new JSONObject();
		try {
			item.put("from", req.getOrigin());
			item.put("to", req.getDestination());
			item.put("outboundDate", req.getDepartureDate() );
			item.put("inboundDate", req.getReturnDate());
			item.put("numberOfAdults", req.getNumberOfPassengers());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return item.toString();
	}
	
	public HttpResponse getSupplierFlights(String reqMsg, String supplier)
    {
		HttpResponse response = null;
		 String restUrl= null;
		if(supplier.equals("Crazy")){
			restUrl="http://crazyAir/flights";
		}
		else{
			restUrl="http://ToughJet/flights";
		}
		HttpClient httpClient = HttpClientBuilder.create().build();
		 HttpPost request = new HttpPost(restUrl);
		 request.addHeader("content-type", "application/json");
		 StringEntity params =null;
		try {
			params = new StringEntity(reqMsg);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		 request.setEntity(params);
		 try {
			response = httpClient.execute(request);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 return response;
    }
	
}
