package com.nit.comp;

import org.springframework.stereotype.Component;

@Component
public class AndroidOS implements OperatingSystem {

	@Override
	public String getOSType() {
		return "Android";
	}

}
