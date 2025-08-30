package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.TaskProcessor;

public class App {
    public static void main(String[] args) {
    	try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class))
    	{
    		System.out.println("=======IOC container created");
    		TaskProcessor task1=ctx.getBean(TaskProcessor.class);
    		TaskProcessor task2=ctx.getBean(TaskProcessor.class);
    		TaskProcessor task3=ctx.getBean(TaskProcessor.class);
    		task1.process("Addition");
    		task2.process("Subtraction");
    		task3.process("Multiplication");
    		task1.getTask();
    		task2.getTask();
    		task3.getTask();
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}
