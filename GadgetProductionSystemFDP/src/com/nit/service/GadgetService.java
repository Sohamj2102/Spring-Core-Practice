package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.comp.Gadget;
import com.nit.factory.GadgetFactory;

@Component
public class GadgetService {
	private GadgetFactory gadgetFactory;

	@Autowired
	public void setGadgetFactory(GadgetFactory gadgetFactory) {
		this.gadgetFactory = gadgetFactory;
	}
	public String produceGadget(String type, String osType) {
		Gadget gadget=gadgetFactory.createGadget(type, osType);
		return gadget.getDetails();
	}

	
}
