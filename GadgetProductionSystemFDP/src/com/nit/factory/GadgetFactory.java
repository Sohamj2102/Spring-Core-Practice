package com.nit.factory;

import com.nit.comp.Gadget;

public interface GadgetFactory {
	Gadget createGadget(String type, String osType);

}
