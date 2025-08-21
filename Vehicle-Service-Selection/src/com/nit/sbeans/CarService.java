package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class CarService implements VehicleService {

	@Override
	public void performService() {
		System.out.println("CarService.performService()");
	}

}
