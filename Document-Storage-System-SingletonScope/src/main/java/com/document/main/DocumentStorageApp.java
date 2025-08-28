package com.document.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.document.config.AppConfig;
import com.document.sbeans.StorageManager;

public class DocumentStorageApp {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class)){
			StorageManager bean1 = ctx.getBean("storage",StorageManager.class);
			bean1.save("Application Context");
			StorageManager bean2 = ctx.getBean("storage",StorageManager.class);
			bean2.save("Application Context");
			System.out.println(bean1.hashCode()==bean2.hashCode()?"Singleton":"Not a singleton");
		}

	}

}
