package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ServiceCenter {
	@Autowired
	@Qualifier("carService")
	private VehicleService services;
	
	public void performService()
	{
		services.performService();
	}
}
