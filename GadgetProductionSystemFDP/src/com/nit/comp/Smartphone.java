package com.nit.comp;

public class Smartphone implements Gadget {

	String osType;
	int numCameras;
	
	
	public Smartphone(String osType, int numCameras) {
		super();
		this.osType = osType;
		this.numCameras = numCameras;
	}


	@Override
	public String getDetails() {
		return "Smartphone with "+ osType +" OS and "+numCameras+ " Cameras";
	}

}
