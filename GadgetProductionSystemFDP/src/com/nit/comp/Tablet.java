package com.nit.comp;

public class Tablet implements Gadget {

	String osType;
	String screenSize;
	
	
	public Tablet(String osType, String screenSize) {
		super();
		this.osType = osType;
		this.screenSize = screenSize;
	}


	@Override
	public String getDetails() {
		return "Tablet with "+ osType +" OS and "+screenSize+ " Screen";
	}

}
