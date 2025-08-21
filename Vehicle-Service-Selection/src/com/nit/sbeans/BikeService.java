package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class BikeService implements VehicleService {

	@Override
	public void performService() {
		System.out.println("BikeService.performService()");
	}

}
