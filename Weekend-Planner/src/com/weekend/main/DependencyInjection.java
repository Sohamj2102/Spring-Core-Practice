package com.weekend.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.weekend.sbeans.WeekendMessageGenerator;

public class DependencyInjection {

	public static void main(String[] args)
	{
		//create IOC container
		FileSystemXmlApplicationContext ctx=
				new FileSystemXmlApplicationContext("src/com/weekend/cfgs/applicationContext.xml");
		//get spring bean class obj ref
		Object bean = ctx.getBean("wmg");
		//typecating
		WeekendMessageGenerator generator=(WeekendMessageGenerator) bean;
		//invoke business method
		String weekendMessage = generator.getWeekendMessage();
		//print result
		System.out.println(weekendMessage);
		//close IOC container
		ctx.close();
		

	}

}
