package com.nit.comp;

import org.springframework.stereotype.Component;

@Component
public class WindowsOS implements OperatingSystem {

	@Override
	public String getOSType() {
		return "Windows";
	}

}
