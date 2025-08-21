package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfig;
import com.nit.sbeans.ServiceCenter;

public class ServiceCenterTester {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class)){
			ServiceCenter bean = ctx.getBean(ServiceCenter.class);
			bean.performService();
			
		}
	}

}
