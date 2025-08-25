package com.nit.comp;

import org.springframework.stereotype.Component;

@Component
public class IOS implements OperatingSystem {

	@Override
	public String getOSType() {
		return "iOS";
	}

}
