package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfig;
import com.nit.service.GadgetService;

public class GadgetApp {
public static void main(String[] args) {
	try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class))
	{
		GadgetService bean = ctx.getBean(GadgetService.class);
		String produceGadget = bean.produceGadget("laptop", "android");
		System.out.println(produceGadget);
	}
}
}
