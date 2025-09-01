package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.ShippingService;

public class App {
    public static void main(String[] args) {
       try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class))
       {
    	   ShippingService shippingService = ctx.getBean(ShippingService.class);
    	   double seaShippingCost = shippingService.getShippingCost("sea",5.0);
    	   System.out.println("Sea Shipping Cost:"+seaShippingCost);
    	   double airShippingCost = shippingService.getShippingCost("air", 5.0);
    	   System.out.println("Air Shipping Cost:"+airShippingCost);
    	   double roadShippingCost = shippingService.getShippingCost("road", 5.0);
    	   System.out.println("Road Shipping Cost:"+roadShippingCost);


       }
       catch (Exception e) {
		e.printStackTrace();
	}
    }
}
