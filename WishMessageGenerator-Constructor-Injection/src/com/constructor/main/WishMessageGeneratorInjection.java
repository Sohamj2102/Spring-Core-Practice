package com.constructor.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.constructor.sbeans.WishMessageGenerator;

public class WishMessageGeneratorInjection {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/constructor/confg/applicationContext.xml");

		WishMessageGenerator os = (WishMessageGenerator) ctx.getBean("wmg");
		os.generateWishMessage("Soham");
		ctx.close();

	}

}
