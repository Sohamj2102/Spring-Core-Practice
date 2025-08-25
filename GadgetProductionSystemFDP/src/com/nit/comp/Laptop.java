package com.nit.comp;

public class Laptop implements Gadget {

	String osType;
	String ramSize;
	
	
	public Laptop(String osType, String ramSize) {
		super();
		this.osType = osType;
		this.ramSize = ramSize;
	}


	@Override
	public String getDetails() {
		return "Laptop with "+ osType +" OS and "+ramSize+ " RAM";
	}

}
