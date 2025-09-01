package com.nit.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
private Map<String, ShippingStrategy> service;

@Autowired
public ShippingService(Map<String, ShippingStrategy> service) {
	super();
	this.service = service;
}
public double getShippingCost(String type, double weight)
{
	ShippingStrategy shippingStrategy = service.get(type);
	return shippingStrategy.calculateCost(weight);
}

}
