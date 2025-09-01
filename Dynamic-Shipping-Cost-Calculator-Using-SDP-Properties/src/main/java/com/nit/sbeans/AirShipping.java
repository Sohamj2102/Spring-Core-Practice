package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("air")
public class AirShipping implements ShippingStrategy {
	@Value("${shipping.air.base}")
	private double base;
	@Value("${shipping.air.perKg}")
	private double perKg;

	@Override
	public double calculateCost(double weight) {
		return base+(perKg*weight);
	}

}
