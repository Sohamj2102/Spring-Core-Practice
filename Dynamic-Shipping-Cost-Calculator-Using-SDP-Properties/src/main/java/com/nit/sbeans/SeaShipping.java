package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sea")
public class SeaShipping implements ShippingStrategy {
	@Value("${shipping.sea.base}")
	private double base;
	@Value("${shipping.sea.perKg}")
	private double perKg;

	@Override
	public double calculateCost(double weight) {
		return base+(perKg*weight);
	}

}
