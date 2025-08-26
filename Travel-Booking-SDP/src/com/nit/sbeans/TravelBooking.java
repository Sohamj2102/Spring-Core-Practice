package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public final class TravelBooking {//final: closed for modification
	
	// // Composition instead of inheritance
	private Transportation transportation;

	//  Setter Injection for Strategy
	@Autowired
	@Qualifier("bus")
	public void setTransportation(Transportation transportation) {
		this.transportation = transportation;
	}
	public void executeBooking(String destination, double price)
	{
		transportation.bookTrip(destination, price);
	}
	
}
