package com.address.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.address.sbeans.Address;
import com.address.sbeans.Student;

@Configuration
public class AppConfig
{
	
	@Bean
	public Address getAddress()
	{
		Address a=new Address();
		a.setCity("Nanded");
		a.setState("Maharashtra");
		return a;
	}
	@Bean
	public Student getStudent()
	{
		Student s=new Student();
		s.setName("Soham");
		return s;
	}
}
