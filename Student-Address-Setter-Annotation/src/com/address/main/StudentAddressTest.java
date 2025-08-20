package com.address.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.address.config.AppConfig;
import com.address.sbeans.Student;

public class StudentAddressTest 
{
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class)){
			Student bean = ctx.getBean("getStudent",Student.class);
			bean.showStudentDetails();
		}
	}
}
