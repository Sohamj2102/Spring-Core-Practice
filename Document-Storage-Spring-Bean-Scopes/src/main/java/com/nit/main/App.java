package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.StorageManager;

public class App {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class))
        {
			StorageManager s1 = ctx.getBean(StorageManager.class);
			s1.store("Demo.pdf");
			StorageManager s2 = ctx.getBean(StorageManager.class);
			s2.store("First.pdf");
		}
        catch (Exception e) {
			e.printStackTrace();
		}
    }
}
