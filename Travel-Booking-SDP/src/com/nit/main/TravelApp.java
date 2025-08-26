package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfig;
import com.nit.sbeans.TravelBooking;

public class TravelApp {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class)){
			TravelBooking bean = ctx.getBean(TravelBooking.class);
			bean.executeBooking("Nanded", 325);
		}
	}
}
