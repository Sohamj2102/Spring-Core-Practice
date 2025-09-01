package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("road")
public class RoadShipping implements ShippingStrategy {
	@Value("${shipping.road.base}")
	private double base;
	@Value("${shipping.road.perKg}")
	private double perKg;

	@Override
	public double calculateCost(double weight) {
		return base+(perKg*weight);
	}

}
