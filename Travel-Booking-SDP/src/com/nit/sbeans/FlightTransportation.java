package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("flight")
public final class FlightTransportation implements Transportation {

	@Override
	public void bookTrip(String destination, double price) {
		System.out.println("Booked a trip to "+destination+" by Flight for "+price+".");

	}

}
