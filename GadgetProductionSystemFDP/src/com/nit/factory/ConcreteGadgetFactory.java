package com.nit.factory;

import org.springframework.stereotype.Component;

import com.nit.comp.Gadget;
import com.nit.comp.Laptop;
import com.nit.comp.Smartphone;
import com.nit.comp.Tablet;
@Component
public class ConcreteGadgetFactory implements GadgetFactory  {

	
	public  Gadget createGadget(String type, String osType) {
		if(type.equalsIgnoreCase("Smartphone")) {
			return new Smartphone(osType, 3);
		}
		else if(type.equalsIgnoreCase("Laptop"))
		{
			return new Laptop(osType, "8GB");
		}
		else if(type.equalsIgnoreCase("Tablet"))
		{
			return new Tablet(osType, "10-inch");
		}
		else 
		{
			throw new IllegalArgumentException("Gadget not available "+type);
		}
		
	}

}
