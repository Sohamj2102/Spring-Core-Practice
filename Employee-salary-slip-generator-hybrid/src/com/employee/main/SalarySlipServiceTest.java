package com.employee.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.employee.sbeans.SalarySlipService;

public class SalarySlipServiceTest {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/employee/confg/applicationContext.xml")) {
			SalarySlipService bean = ctx.getBean(SalarySlipService.class);
			bean.generateSlip();
			for (String name : ctx.getBeanDefinitionNames()) {
				System.out.println(name);
			}
		}
	}
}
