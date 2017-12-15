package com.travix.medusa.busyflights.collection;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.service.BusyFlightsService;



@RestController
public class BusyFlightsController {
	
	@Autowired
	private BusyFlightsService flightsSvc;
	
	@RequestMapping("/flights")
	public List<BusyFlightsResponse> getAllTopics( @RequestBody BusyFlightsRequest req){
		
		return flightsSvc.getFlights(req);
	}
	
	
}
